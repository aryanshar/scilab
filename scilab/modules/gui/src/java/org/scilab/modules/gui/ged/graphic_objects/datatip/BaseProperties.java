/*
 * Scilab ( http://www.scilab.org/ ) - This file is part of Scilab
 * Copyright (C) 2013 - Marcos CARDINOT
 *
 * This file must be used under the terms of the CeCILL.
 * This source file is licensed as described in the file COPYING, which
 * you should have received as part of this distribution.  The terms
 * are also available at
 * http://www.cecill.info/licences/Licence_CeCILL_V2-en.txt
 *
 */
package org.scilab.modules.gui.ged.graphic_objects.datatip;

import javax.swing.JPanel;
import org.scilab.modules.gui.ged.MessagesGED;
import org.scilab.modules.gui.ged.graphic_objects.SimpleSection;
import org.scilab.modules.gui.ged.graphic_objects.properties.Datatip;
import org.scilab.modules.gui.ged.graphic_objects.properties.GraphicObject;

/**
* Construction and startup of all components of the section: Base Properties.
* @author Marcos CARDINOT <mcardinot@gmail.com>
*/
public class BaseProperties extends SimpleSection {
    private JPanel sectionPanel;
    private static BaseProperties instance;
    private Datatip datatip = new Datatip();
    private GraphicObject graphicObject = new GraphicObject();

    /**
    * Initializes the properties and the icons of the buttons.
    * @param objectID Enters the identification of datatip.
    */
    public BaseProperties(Integer objectID) {
        super(MessagesGED.base_properties, "datatip");
        instance = this;
        sectionPanel = getSectionPanel();
        initComponents(objectID);
    }

    /**
     * Get instance
     * @return instance
     */
    public static BaseProperties getInstance() {
        return instance;
    }

    /**
    * Add all the properties in this section.
    * @param objectID uid
    */
    @Override
    public final void initComponents(Integer objectID) {
        int row = 0;
        final int leftmargin = 16; //to inner components
        int column = 0; //first column

        datatip.tipAutoOrientation(sectionPanel, row++, column, leftmargin, objectID);

        datatip.tipOrientation(sectionPanel, row++, column, leftmargin, objectID);

        datatip.tipLabelMode(sectionPanel, row++, column, leftmargin, objectID);

        graphicObject.visible(sectionPanel, row++, column, leftmargin, objectID);
    }
}