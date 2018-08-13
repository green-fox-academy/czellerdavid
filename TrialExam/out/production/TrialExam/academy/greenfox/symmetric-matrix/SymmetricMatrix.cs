using System;
using System.Collections.Generic;

namespace SymmetricMatrix
{
    public class Program
    {
        public static void Main(string[] args)
        {
            // Create a function named `IsSymmetric` that takes an n×n integer matrix (list of lists) as parameter
            // and returns true, if is that matrix is symmetric (diagonally from top-left to bottom-right)
            // or false if it is not
            //
            // example for symmetric matrix:
            // 1 0 1
            // 0 2 2
            // 1 2 5
            //
            // example for not symmetric matrix
            // 7 7 7
            // 6 5 7
            // 1 2 1

            var symmetricMatrix = new List<List<int>>
            {
                new List<int> { 1, 0, 1 },
                new List<int> { 0, 2, 2 },
                new List<int> { 1, 2, 5 }
            };

            Console.WriteLine(IsSymmetric(symmetricMatrix)); // should print out true

            Console.ReadLine();
        }
    }
}
