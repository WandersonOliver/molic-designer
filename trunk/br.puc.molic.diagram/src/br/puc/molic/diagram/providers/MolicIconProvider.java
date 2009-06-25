package br.puc.molic.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.icon.GetIconOperation;
import org.eclipse.gmf.runtime.common.ui.services.icon.IIconProvider;
import org.eclipse.swt.graphics.Image;

/**
 * @generated
 */
public class MolicIconProvider extends AbstractProvider implements
        IIconProvider {

    /**
     * @generated
     */
    public Image getIcon(IAdaptable hint, int flags) {
        return MolicElementTypes.getImage(hint);
    }

    /**
     * @generated
     */
    public boolean provides(IOperation operation) {
        if (operation instanceof GetIconOperation) {
            return ((GetIconOperation) operation).execute(this) != null;
        }
        return false;
    }
}