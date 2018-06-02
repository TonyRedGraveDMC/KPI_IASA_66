using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Kyrsach2k18
{
    class Program
    {
        //abstract class AbstractNumber
        //{

        //}

        //class


        abstract class Number<T>
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

            public override string ToString()
            {
                return num.ToString();
            }
        }

        class Rnumber : Number<Rnumber>
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

        }

        static void Main(string[] args)
        {

            Rnumber r1 = new Rnumber(16);
            Rnumber r2 = new Rnumber(19);
            Rnumber r3 = r1.Add(r2);
            Rnumber r4 = r1.Minus(r2);
            Rnumber r5 = r1.Multiply(r2);


            Console.WriteLine(r3);
            Console.WriteLine(r4);
            Console.WriteLine(r5);



        }
    }

}