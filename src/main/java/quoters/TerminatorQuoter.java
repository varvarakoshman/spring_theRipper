package quoters;

import lombok.Setter;

import javax.annotation.PostConstruct;

@Profiling
@DeprecatedClass(newImpl = T1000.class)
public class TerminatorQuoter implements Quoter {
    @Setter
    @InjectRandomInt(min = 2, max = 7)
    private int repeat;
    @Setter
    private String message;

    @PostConstruct
    public void init(){
        System.out.println("Phase 2");
        System.out.println(repeat);
    }

    public TerminatorQuoter(){
        System.out.println("Phase 1");
    }

    @PostProxy
    public void sayQuote() {
        System.out.println("3 Phase");
        for (int i = 0; i < repeat; i++) {
            System.out.println("message = " + message);
        }
    }
}
