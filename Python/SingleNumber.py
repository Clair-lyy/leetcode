import operator
import functools


class SingleNumber:
    def getSingleNumber(self, nums):
        print(nums)
        return functools.reduce(operator.xor, nums)


if __name__ == '__main__':
    print(SingleNumber().getSingleNumber([1, 2, 1, 3, 2, 3, 4, 5, 7, 7, 5]))
