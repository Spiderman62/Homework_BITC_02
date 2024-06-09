public class CalculatorQuadratic {
    private double a,b,c,x1,x2,delta;
    public void setCalculatorQuadratic(double a,double b,double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public void actionCalculatorQuadratic(){
        this.delta = this.b * this.b - 4 * this.a * this.c;
        if (this.a == 0) {
            System.out.println("The second order equation is not satisfying, so it will switch to the first order program");
            if (this.b == 0) {
                System.out.printf("Infinite equations.\n");
            } else {
                this.x1 = -this.c / this.b;
                System.out.printf("The first order equation and the solution are: x = %.2f\n", this.x1);
            }
        } else {
            if (this.delta < 0) {
                System.out.printf("Infinite equations.\n");
            } else if (this.delta == 0) {
                this.x1 = this.x2 = -this.b / (2 * this.a);
                System.out.printf("The equation with a double solution is: x1 = x2 = %.2f\n", this.x1);
            } else {
                this.x1 = (-this.b + Math.sqrt(delta)) / (2 * this.a);
                this.x2 = (-this.b - Math.sqrt(delta)) / (2 * this.a);
                System.out.printf("The equation has two differential solutions:\n");
                System.out.printf("x1 = %.2f\n", this.x1);
                System.out.printf("x2 = %.2f\n", this.x2);
            }
        }
    }
}
