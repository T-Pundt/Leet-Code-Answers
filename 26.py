def main():
    nums = [1, 1, 2]

    if len(set(nums)) == 1:
        return 1

    for k in range(0, len(nums)):
        if k != len(nums)-1:
            if nums[k] == nums[k+1] or nums[k] == nums[k-1]:
                nums.remove(nums[k])
                nums.append("_")

    x = 0
    for value in nums:
        if value != "_":
            x += 1


    print(f"{nums} and {x}")


if __name__ == '__main__':
    main()