package Alexandr_Nikitchenko;

/* Таблица умножения
Выведи на экран таблицу умножения 10 на 10 в следующем виде:
1 2 3 …
2 4 6 …
3 6 9 …
…
*/

public class Solution
{
    public static void main(String[] args)
    {
        int a, b;
        for (a = 1; a <= 10; a++)
        {
            for (b = 1; b <= 10; b++)
            {
                System.out.print(a * b + " ");
            }
            System.out.println();

        }
    }
}