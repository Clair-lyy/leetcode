class ReverseInteger:
    def reverse(self, num):
        reversed = 0
        while num != 0:
            reversed *= 10
            reversed += num % 10
            num = num // 10

        return reversed


if __name__ == '__main__':
    print(ReverseInteger().reverse(12345657872345678))
