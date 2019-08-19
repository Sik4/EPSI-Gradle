package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class civetGradleController {

    @RequestMapping("/civet")
    public String getCivet() {
        return "Le civet de lapin, longtemps considéré comme la viande des pauvres, est l'un des mets les plus appréciés au niveau international. Connu dès l'Antiquité sur le pourtour de la Méditerranée, le vin étant alors un des seuls moyens connus de préserver la viande de la putréfaction, il fut de toutes les tables au cours du Moyen Âge. Le lapin, jusqu'au xixe siècle, était chassé au furet. Après qu'il a failli disparaître à cause de la myxomatose, les qualités de sa viande en font actuellement un mets de choix, inscrit à la table des plus grands restaurants, ou des plus populaires, en tant que plat du jour. Sa recette a fortement évolué au cours du temps.";
    }
}
