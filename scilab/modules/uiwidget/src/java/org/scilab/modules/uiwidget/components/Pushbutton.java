/*
 * Scilab ( http://www.scilab.org/ ) - This file is part of Scilab
 * Copyright (C) 2012 - Scilab Enterprises - Calixte DENIZET
 *
 * This file must be used under the terms of the CeCILL.
 * This source file is licensed as described in the file COPYING, which
 * you should have received as part of this distribution.  The terms
 * are also available at
 * http://www.cecill.info/licences/Licence_CeCILL_V2-en.txt
 *
 */

package org.scilab.modules.uiwidget.components;

import org.scilab.modules.gui.bridge.pushbutton.SwingScilabPushButton;

import org.scilab.modules.uiwidget.UIComponent;
import org.scilab.modules.uiwidget.UIWidgetException;

public class Pushbutton extends ScilabWidget {

    public Pushbutton(UIComponent parent) throws UIWidgetException {
        super(parent);
    }

    public Object newInstance() {
        widget = new SwingScilabPushButton();

        return widget;
    }
}