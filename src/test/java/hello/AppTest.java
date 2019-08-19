package hello;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = App.class)
@AutoConfigureMockMvc
public class AppTest {

    @Autowired
    private MockMvc mvc;

    @Test
    public void helloGradle() throws Exception {
        mvc.perform(get("/"))
            .andExpect(status().isOk())
            .andExpect(content().string("Hello Gradle!"));
    }
    @Test
    public void killLapin() throws Exception {
        mvc.perform(get("/lapin"))
                .andExpect(status().isOk())
                .andExpect(content().string("Le lapin est mort!"));
    }
    
    @Test
    public void getCivet() throws Exception {
        mvc.perform(get("/civet"))
                .andExpect(status().isOk())
                .andExpect(content().string("Le civet de lapin, longtemps considéré comme la viande des pauvres, est l'un des mets les plus appréciés au niveau international. Connu dès l'Antiquité sur le pourtour de la Méditerranée, le vin étant alors un des seuls moyens connus de préserver la viande de la putréfaction, il fut de toutes les tables au cours du Moyen Âge. Le lapin, jusqu'au xixe siècle, était chassé au furet. Après qu'il a failli disparaître à cause de la myxomatose, les qualités de sa viande en font actuellement un mets de choix, inscrit à la table des plus grands restaurants, ou des plus populaires, en tant que plat du jour. Sa recette a fortement évolué au cours du temps."));
    }

    @Test
    public void pouetPouetGradle() throws Exception {
        mvc.perform(get("/pouet"))
                .andExpect(status().isOk())
                .andExpect(content().string("Hello PouetPouet!"));
    }

    @Test
    public void helloEvierMetal() throws Exception {
        mvc.perform(get("/evier"))
                .andExpect(status().isOk())
                .andExpect(content().string("Evier Metal!"));
    }
    
    @Test
    public void boomerangGradle() throws Exception {
        mvc.perform(get("/boomerang"))
                .andExpect(status().isOk())
                .andExpect(content().string("Le boomerang revient!"));
    }
}
