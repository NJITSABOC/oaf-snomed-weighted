package edu.njit.cs.saboc.blu.sno.nat;

import edu.njit.cs.saboc.blu.sno.localdatasource.concept.SCTConcept;
import edu.njit.cs.saboc.nat.generic.NATBrowserPanel;
import edu.njit.cs.saboc.nat.generic.gui.filterable.list.renderer.SimpleConceptRenderer;
import edu.njit.cs.saboc.nat.generic.gui.panels.ConceptListPanel;

/**
 * A concept list that displays the stated children of the focus concept
 * 
 * @author Chris O
 */
public class SCTStatedChildrenList extends ConceptListPanel<SCTConcept> {
    
    public SCTStatedChildrenList(NATBrowserPanel<SCTConcept> mainPanel) {
        
        super(mainPanel, 
                SCTNATDataRetrievers.getStatedChildrenRetriever(mainPanel),
                new SimpleConceptRenderer<>(mainPanel), 
                true,
                true,
                true);
    }
}
