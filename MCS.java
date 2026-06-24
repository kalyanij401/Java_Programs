public class MCS extends computerD {
    int m_java;
    int m_DSA;
    int m_python;
    MCS(int java,int DSA,int python)
    {   
        super(350,200,180);
        this.m_java=java;
        this.m_DSA=DSA;
        this.m_python=python;
    }
    void display1()
    {
        System.out.println("computer department MCS");
        System.out.println("java student="+m_java);
        System.out.println("DSA student="+m_DSA);
        System.out.println("python student="+m_python);
    }
}
