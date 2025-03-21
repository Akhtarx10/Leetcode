class Solution {
    public List<String> findAllRecipes(String[] recipes, List<List<String>> ingredients, String[] supplies) {
        Map<String, List<String>> graph = new HashMap<>();
        Map<String, Integer> indegreeMap = new HashMap<>();
      
        for (int i = 0; i < recipes.length; ++i) {
            for (String ingredient : ingredients.get(i)) {
                graph.computeIfAbsent(ingredient, k -> new ArrayList<>()).add(recipes[i]);
            }
            indegreeMap.put(recipes[i], ingredients.get(i).size());
        }
      
        Deque<String> queue = new ArrayDeque<>();
      
        for (String supply : supplies) {
            queue.offer(supply);
        }
      
        List<String> availableRecipes = new ArrayList<>();
      
        while (!queue.isEmpty()) {
            int size = queue.size();
          
            for (int i = 0; i < size; ++i) {
                String ingredient = queue.pollFirst();
              
                for (String recipe : graph.getOrDefault(ingredient, Collections.emptyList())) {
                    indegreeMap.put(recipe, indegreeMap.get(recipe) - 1);
                  
                    if (indegreeMap.get(recipe) == 0) {
                        availableRecipes.add(recipe);
                        queue.offer(recipe);
                    }
                }
            }
        }
      
        return availableRecipes;
    }
}
