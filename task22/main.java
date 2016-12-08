public class Main {
    public static class Vector{
        double e [];

        public Vector (int size){
            this.e = new double[size];
        }

        public int GetSize(){
            return e.length;
        }

        public double GetLength(){
            double result = 0;
            int n  = GetSize();
            for (int i = 0; i < n; ++i){
                result += this.e[i] * this.e[i];
            }
            return Math.sqrt(result);
        }
        public Vector Addition(Vector other){
            int n = GetSize();
            Vector result = new Vector(n);
            for (int i = 0; i < n; ++i){
                result.e[i] = other.e[i] + this.e[i];
            }
            return result;
        }

        public Vector Subtract(Vector other){
            int n = GetSize();
            Vector result = new Vector(n);
            for (int i = 0; i < n; ++i){
                result.e[i] = this.e[i] - other.e[i];
            }
            return result;
        }
        public double DotProduct(Vector other){
            int n = GetSize();
            double result = 0;
            for (int i = 0; i < n; ++i){
                result += this.e[i] * other.e[i];
            }
            return result;
        }
        public Vector Norm(){
            int n = GetSize();
            Vector result = new Vector(n);
            for (int i = 0; i < n; ++i){
                result.e[i] = this.e[i] / GetLength();
            }
            return result;
        }
        public Vector Multiple(double c){
            int n = GetSize();
            Vector result = new Vector(n);
            for (int i = 0; i < n; ++i){
                result.e[i] = this.e[i] * c;
            }
            return result;
        }
        public void Print(){
            int n = GetSize();
            for (int i = 0; i < n; ++i){
                System.out.print(this.e[i] + " ");
            }
            System.out.print("\n");
        }
    }

    public static void main(final String[] args) {
        int n = 3;
        double a1[] = {1, 2, 3}, a2[] = {3, 2, 1};

        Vector v1 = new Vector(n), v2 = new Vector(n);
        v1.e = a1;
        v2.e = a2;

        Vector result = v1.Addition(v2);
        System.out.println("Addition");
        result.Print();

        result = v1.Subtract(v2);
        System.out.println("Substract");
        result.Print();

        double c = 5.5;
        result = v1.Multiple(c);
        System.out.println("Multiple");
        result.Print();

        result = v1.Norm();
        System.out.println("Norm");
        result.Print();

        System.out.println("DotProduct " + v1.DotProduct(v2));

    }

}
