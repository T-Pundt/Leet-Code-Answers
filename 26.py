def main():
    nums = [0, 0, 0, 0, 3]  # bad algorithm, just start over and do a bubble sort method instead


    if len(set(nums)) == 1:
        return 1

    for k in range(0, len(nums)):
        if k != len(nums) - 1:
            if nums[k] == nums[k + 1] or nums[k] == nums[k - 1]:
                nums.remove(nums[k])
                nums.insert(nums[k], 1000)

    nums.sort()

    x = 0
    for value in nums:
        if value != 1000:
            x += 1

    print(f"{nums} and {x}")


if __name__ == '__main__':
    main()
