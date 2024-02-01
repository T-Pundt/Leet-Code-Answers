def main():
    str = ["alic3", "bob", "3", "4", "00000"]

    result_array = []

    for i in range(0, len(str)):
        inspection_string = str[i]
        if all(char.isdigit() for char in inspection_string):
            result_array.append(int(inspection_string))

        else:
            result_array.append(len(str[i]))

    print(max(result_array))


if __name__ == '__main__':
    main()
