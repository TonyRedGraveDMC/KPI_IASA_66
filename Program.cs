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
            Console.WriteLine(tokens[0] + sign + tokens[1] + "i");

            string Quater = "3324 - 3414i + 32j + 16k";
            Console.WriteLine(Quater);

            string patern1 = @"(i|j|k)";
            string patern2 = @"\+|\-";    
            Regex rgx1 = new Regex(patern1);
            Quater = rgx1.Replace(Quater,"");
            Console.WriteLine(Quater);

         
            string[] parts = Regex.Split(Quater, patern2);
            string Sign = Regex.Match(Quater, patern2).Value;

            double RPart = Convert.ToDouble(parts[0]);
            double iPart = Convert.ToDouble(parts[1]);
            double jPart = Convert.ToDouble(parts[2]);
            double kPart = Convert.ToDouble(parts[3]);
            
            Console.WriteLine(parts[0] + Sign + parts[1] + "i"+ Sign+parts[2]+"j"+Sign+parts[3] + "k");

            //string[] array = Regex.Matches(Quat,)

            //------------------------------------------------------Quaternion--------------------------------------------------------
            //            Hnumber c1 = new Hnumber(1,-2, 3, -4);
            //            Hnumber c2 = new Hnumber(1, 0, 0, 0);
            //            Hnumber c3 = c1.Add(c2);
            //            Console.WriteLine(c3);
            //            Hnumber c4 = c1.Minus(c2);
            //            Console.WriteLine(c4);

            //            Hnumber c6 = c1.Multiply(c2);
            //            Console.WriteLine(c6);

            //            Hnumber c5 = c1.Division(c2);
            //            Console.WriteLine(c5);



            ////------------------------------------------------------Complex--------------------------------------------------------




            //            Cnumber c11 = new Cnumber(2, -3);
            //            Cnumber c21 = new Cnumber(0, 1);

            //            Cnumber c31 = c11.Add(c21);
            //            Console.WriteLine(c31);

            //            Cnumber c41 = c11.Minus(c21);
            //            Console.WriteLine(c41);

            //            Cnumber c51 = c11.Multiply(c21);
            //            Console.WriteLine(c51);

            //            Cnumber c61 = c11.Division(c21);
            //            Console.WriteLine(c61);

            ////------------------------------------------------------REAL--------------------------------------------------------

            //            Rnumber r1 = new Rnumber(320);
            //            Rnumber r2 = new Rnumber();

            //            Rnumber r3 = r1.Add(r2);
            //            Console.WriteLine(r3);

            //            Rnumber r4 = r1.Minus(r2);
            //            Console.WriteLine(r4);

            //            Rnumber r5 = r1.Multiply(r2);
            //            Console.WriteLine(r5);

            //            Rnumber r6 = r1.Division(r2);
            //            Console.WriteLine(r6);







        }
    }

}