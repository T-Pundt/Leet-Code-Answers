def main():
    nums = [0,0,1,1,1,2,2,3,3,4]
    updated = []

    for value in nums:
        if value not in updated:
            updated.append(value)

    print(f"{updated}")


if __name__ == '__main__':
    main()


