package br.puc.molic.diagram.view.factories;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.core.util.ViewUtil;
import org.eclipse.gmf.runtime.diagram.ui.view.factories.ConnectionViewFactory;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.notation.NotationFactory;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.Routing;
import org.eclipse.gmf.runtime.notation.RoutingStyle;
import org.eclipse.gmf.runtime.notation.View;

import br.puc.molic.diagram.edit.parts.UtteranceEditPart;
import br.puc.molic.diagram.edit.parts.UtteranceLabelEditPart;
import br.puc.molic.diagram.part.MolicVisualIDRegistry;

/**
 * @generated
 */
public class UtteranceViewFactory extends ConnectionViewFactory {

	/**
	 * @generated 
	 */
	protected List createStyles(View view) {
		List styles = new ArrayList();
		styles.add(NotationFactory.eINSTANCE.createRoutingStyle());
		styles.add(NotationFactory.eINSTANCE.createFontStyle());
		return styles;
	}

	/**
	 * @generated NOT
	 */
	protected void decorateView(View containerView, View view,
			IAdaptable semanticAdapter, String semanticHint, int index,
			boolean persisted) {
		if (semanticHint == null) {
			semanticHint = MolicVisualIDRegistry
					.getType(UtteranceEditPart.VISUAL_ID);
			view.setType(semanticHint);
		}
		super.decorateView(containerView, view, semanticAdapter, semanticHint,
				index, persisted);

		NotationPackage NOTATION = NotationPackage.eINSTANCE;
		EClass routingStyle = NOTATION.getRoutingStyle();
		RoutingStyle routing = (RoutingStyle) view.getStyle(routingStyle);
		if (routing == null) {
			System.err.println("How could it happen? see createStyles()");
			routing = (RoutingStyle) view.createStyle(routingStyle);
		}
		routing.setRouting(Routing.RECTILINEAR_LITERAL);

		IAdaptable eObjectAdapter = null;
		EObject eObject = (EObject) semanticAdapter.getAdapter(EObject.class);
		if (eObject != null) {
			eObjectAdapter = new EObjectAdapter(eObject);
		}
		getViewService()
				.createNode(
						eObjectAdapter,
						view,
						MolicVisualIDRegistry
								.getType(UtteranceLabelEditPart.VISUAL_ID),
						ViewUtil.APPEND, true, getPreferencesHint());
	}

}
