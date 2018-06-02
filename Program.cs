using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Text.RegularExpressions;

namespace Kyrsach2018
{
    public class Program
    {
        //abstract class AbstractNumber
        //{

        //}

        //class


       public abstract class AbstractNumber<T>
        {
            private double num;

            public double Num
            {
                get
                {
                    return num;
                }

                set
                {
                    num = value;
                }
            }

            public abstract T Add(T t);
            public abstract T Minus(T t);
            public abstract T Multiply(T t);
            public abstract T Division(T t);

            public override string ToString()
            {
                return num.ToString();
            }
        }

        class Rnumber : AbstractNumber<Rnumber>
        {
            public Rnumber(double num)
            {
                this.Num = num;
            }

            public override Rnumber Add(Rnumber number)
            {
                return new Rnumber(Num + number.Num);
            }

            public override Rnumber Minus(Rnumber realnumber)
            {
                return new Rnumber(Num - realnumber.Num);
            }

            public override Rnumber Multiply(Rnumber number)
            {
                return new Rnumber(Num * number.Num);
            }

            public override Rnumber Division(Rnumber number)
            {
                if (number.Num == 0)
                {
                    Console.WriteLine("division by 0");
                    return null;
                }
                else
                    return new Rnumber(Num / number.Num);
            }
        }

       

        static void Main(string[] args)
        {
            string iN = "3324 - 3414i";
            Console.WriteLine(iN);

            iN = iN.Replace("i", "");
            Console.WriteLine(iN);

            string pattern = @"\+|\-";
            string[] tokens = Regex.Split(iN, pattern);
            string sign = Regex.Match(iN, pattern).Value;
            double rPart = Convert.ToDouble(tokens[0]);
            double imPart = Convert.ToDouble(tokens[1]);
            Console.WriteLine(rPart + sign + imPart + "i");
        

            //Rnumber r1 = new Rnumber(320);
            //Rnumber r2 = new Rnumber(0);
            //Rnumber r3 = r1.Add(r2);
            //Rnumber r4 = r1.Minus(r2);
            //Rnumber r5 = r1.Multiply(r2);
            //Rnumber r6 = r1.Division(r2);


            //Console.WriteLine(r3);
            //Console.WriteLine(r4);
            //Console.WriteLine(r5);
            //Console.WriteLine(r6);



        }
    }

}