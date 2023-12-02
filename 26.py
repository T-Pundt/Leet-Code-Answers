def main():
    nums = [0,0,0,0,3]

    if len(set(nums)) == 1:
        return 1

    for k in range(0, len(nums)):
        if k != len(nums)-1:
            if nums[k] == nums[k+1] or nums[k] == nums[k-1]:
                nums.remove(nums[k])
                nums.append("_")

            if nums[k-1] == nums[k] or nums[k-2] == nums[k-1]:
                nums.remove(nums[k-1])
                nums.append("_")
    x = 0
    for value in nums:
        if value != "_":
            x += 1


    print(f"{nums} and {x}")


if __name__ == '__main__':
    main()


