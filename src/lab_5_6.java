public class lab_5_6
{
        public static void main(String[] args) {
//№1
        int x, y;
        x = 5;
        y = 2;
        System.out.println( "Ділення націло " + x / y);
        System.out.println( "Остача " + x % y );
//№2
        x = 23;
        y = x / 10 + x % 10;
        System.out.println("Сума чисел двозначного числа " + y);
//№3
        double z = 3.3333;
        System.out.println( "Округлене до найблищого цілого: " + Math.round(z));
    }
}
