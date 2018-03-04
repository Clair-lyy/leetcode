class PascalTriangle:
    def getKth(self, k):
        if k == 1:
            return [1]
        if k == 2:
            return [1, 1]
        result = [1, 1]
        for i in range(2, k):
            result = [1] + [result[j] + result[j + 1] for j in range(0, i - 1)] + [1]
        return result


if __name__ == '__main__':
    print(PascalTriangle().getKth(8))
