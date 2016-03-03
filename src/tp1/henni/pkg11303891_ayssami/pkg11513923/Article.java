package tp1.henni.pkg11303891_ayssami.pkg11513923;

import java.util.Date;

public class Article {
    
    
    private String titre;
    private String corps;
    
    public Article(String titre, String corps){
        this.titre=titre;
        this.corps=corps;
    }

    public String getTitre() {
        return titre;
    }

    public String getCorps() {
        return corps;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setCorps(String corps) {
        this.corps = corps;
    }
    
}
