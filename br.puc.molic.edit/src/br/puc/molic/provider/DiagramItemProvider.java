/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package br.puc.molic.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import br.puc.molic.Diagram;
import br.puc.molic.MolicFactory;
import br.puc.molic.MolicPackage;

/**
 * This is the item provider adapter for a {@link br.puc.molic.Diagram} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DiagramItemProvider
	extends ItemProviderAdapter
	implements	
		IEditingDomainItemProvider,	
		IStructuredItemContentProvider,	
		ITreeItemContentProvider,	
		IItemLabelProvider,	
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagramItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
    public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addGoalsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Goals feature.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected void addGoalsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Diagram_goals_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Diagram_goals_feature", "_UI_Diagram_type"),
				 MolicPackage.Literals.DIAGRAM__GOALS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

    /**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
    public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(MolicPackage.Literals.DIAGRAM__ELEMENT);
			childrenFeatures.add(MolicPackage.Literals.DIAGRAM__UTTERANCE);
			childrenFeatures.add(MolicPackage.Literals.DIAGRAM__GOALS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
    protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Diagram.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
    public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Diagram"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
    public String getText(Object object) {
		return getString("_UI_Diagram_type");
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
    public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Diagram.class)) {
			case MolicPackage.DIAGRAM__ELEMENT:
			case MolicPackage.DIAGRAM__UTTERANCE:
			case MolicPackage.DIAGRAM__GOALS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
    protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(MolicPackage.Literals.DIAGRAM__ELEMENT,
				 MolicFactory.eINSTANCE.createScene()));

		newChildDescriptors.add
			(createChildParameter
				(MolicPackage.Literals.DIAGRAM__ELEMENT,
				 MolicFactory.eINSTANCE.createMonologue()));

		newChildDescriptors.add
			(createChildParameter
				(MolicPackage.Literals.DIAGRAM__ELEMENT,
				 MolicFactory.eINSTANCE.createSystemProcess()));

		newChildDescriptors.add
			(createChildParameter
				(MolicPackage.Literals.DIAGRAM__ELEMENT,
				 MolicFactory.eINSTANCE.createUbiquitousAccess()));

		newChildDescriptors.add
			(createChildParameter
				(MolicPackage.Literals.DIAGRAM__ELEMENT,
				 MolicFactory.eINSTANCE.createOpeningPoint()));

		newChildDescriptors.add
			(createChildParameter
				(MolicPackage.Literals.DIAGRAM__ELEMENT,
				 MolicFactory.eINSTANCE.createClosingPoint()));

		newChildDescriptors.add
			(createChildParameter
				(MolicPackage.Literals.DIAGRAM__UTTERANCE,
				 MolicFactory.eINSTANCE.createUtterance()));

		newChildDescriptors.add
			(createChildParameter
				(MolicPackage.Literals.DIAGRAM__UTTERANCE,
				 MolicFactory.eINSTANCE.createBRTUtterance()));

		newChildDescriptors.add
			(createChildParameter
				(MolicPackage.Literals.DIAGRAM__GOALS,
				 ""));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
    public ResourceLocator getResourceLocator() {
		return MolicEditPlugin.INSTANCE;
	}

}
