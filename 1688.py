def main():
    n = 7

    matches = 0
    while n > 1:
        teams_advancing = 0
        if n % 2 != 0:
            n -= 1
            teams_advancing += 1

        matches += n//2
        teams_advancing += n//2

        n = teams_advancing
    print(f"{matches}")






if __name__ == '__main__':
    main()
