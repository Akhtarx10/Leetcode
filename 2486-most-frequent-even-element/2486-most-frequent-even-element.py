class Solution(object):
    def mostFrequentEven(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        from collections import Counter

        # Filter out even numbers and count their frequencies
        even_counts = Counter(num for num in nums if num % 2 == 0)

        if not even_counts:
            return -1  # Return -1 if no even numbers are present

        # Find the even number with the highest frequency, preferring smaller numbers in case of a tie
        most_frequent = min(even_counts, key=lambda x: (-even_counts[x], x))
        return most_frequent
