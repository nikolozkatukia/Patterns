import java.util.List;

class Universiteti {


    private static Universiteti instance;
    private String dasaxeleba;
    private boolean saxelmwifo;
    private List<String> fakultetebi;


    private Universiteti(String dasaxeleba, boolean statsoUniversiteti, List<String> fakultetebi) {
        this.dasaxeleba = dasaxeleba;
        this.saxelmwifo = statsoUniversiteti;
        this.fakultetebi = fakultetebi;
    }


    public static synchronized Universiteti getInstance(String dasaxeleba, boolean statsoUniversiteti, List<String> fakultetebi) {
        if(instance==null) {
            instance=new Universiteti(dasaxeleba,statsoUniversiteti,fakultetebi);
        }
        return instance;
    }

    public String getDasaxeleba() {
        return dasaxeleba;
    }

    public boolean isSaxelmwifo() {
        return saxelmwifo;
    }

    public List<String> getFakultetebi() {
        return fakultetebi;
    }
}
