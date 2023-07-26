/*
 * Copyright: Copyright (c) 2019 Arne Rantzen <arne@rantzen.net>
 * License: GPL-3
 * Last Edited: 08.12.19, 00:03
 */
package de.tyxar.clean_architecture_plugin.ui

import com.intellij.openapi.project.Project
import com.intellij.openapi.ui.DialogWrapper
import javax.swing.JComponent
import javax.swing.JPanel
import javax.swing.JTextField

/**
 * Creates a [DialogWrapper] to get the feature name
 */
class FeatureDialog(project: Project?) :
    DialogWrapper(project) {
    private var contentPanel: JPanel? = null
    private var nameTextField: JTextField? = null

    /**
     * @return feature name
     */
    fun getName(): String? = nameTextField?.text

    override fun createCenterPanel(): JComponent? =  contentPanel

    /**
     * Sets focus on the text field
     */
    override fun getPreferredFocusedComponent(): JComponent? = nameTextField

    init {
        init()
        title = "Clean-Architecture Generator"
    }
}