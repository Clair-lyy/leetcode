class SingleNumberII:
    def getSingleNumber(self, nums):
        return int((sum(set(nums)) * 3 - sum(nums)) / 2)


if __name__ == '__main__':
    print(SingleNumberII().getSingleNumber([1, 1, 1, 2, 2, 2, 3, 3, 3, 4]))
