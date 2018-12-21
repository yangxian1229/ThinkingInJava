package ch13;

import static net.mindview.util.Print.print;

public class E09 {
	static String s = Splitting.knights;
	  public static void main(String[] args) {
	    print(s.replaceAll("a|e|i|o|u","_"));
	  }
}/* Output:
Th_n, wh_n y__ h_v_ f__nd th_ shr_bb_ry, y__ m_st c_t d_wn th_ m_ght__st tr__ _n th_ f_r_st... w_th... _ h_rr_ng!
*///:~
