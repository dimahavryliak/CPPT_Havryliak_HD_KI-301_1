import numpy as np


def main():
    print("Enter the side length of a square: ", end="")
    sideLength = int(input())

    print("Enter the filler symbol: ", end="")
    symbol = input()

    arr = np.full((sideLength, sideLength), " ", dtype=str)

    for i in range(1, sideLength // 2 + 1):
        arr[i - 1, i - 1:sideLength - i + 1] = symbol
        arr[i - 1 + (sideLength // 2), i - 1:sideLength - i + 1] = symbol

    if sideLength % 2 == 1:
        arr[sideLength - 1, sideLength // 2] = symbol

    print(arr)
    np.savetxt("Result.txt", arr, fmt="%s", delimiter="")


if __name__ == "__main__":
    main()