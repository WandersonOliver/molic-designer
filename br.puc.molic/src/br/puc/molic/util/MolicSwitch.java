/**
 * MoLIC Designer (c) 2009 
 * This software is part of Ugo Braga Sangiorgi's MSc work
 * 
 * Developed at Semiotic Engineering Research Lab (SERG)
 * Pontifical Catholic University of Rio de Janeiro, PUCRio
 * 
 * Author: Ugo Braga Sangiorgi - usangiorgi@inf.puc-rio.br
 *
 * $Id$
 */
package br.puc.molic.util;

import br.puc.molic.*;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see br.puc.molic.MolicPackage
 * @generated
 */
public class MolicSwitch<T> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "MoLIC Designer (c) 2009 \nThis software is part of the MSc work of Ugo Braga Sangiorgi and can be copied freely\n\nDeveloped at Semiotic Engineering Research Lab (SERG)\nPontifical Catholic University of Rio de Janeiro, PUCRio\n\nAuthor: Ugo Braga Sangiorgi - usangiorgi@inf.puc-rio.br";

	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MolicPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MolicSwitch() {
		if (modelPackage == null) {
			modelPackage = MolicPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case MolicPackage.DIAGRAM: {
				Diagram diagram = (Diagram)theEObject;
				T result = caseDiagram(diagram);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MolicPackage.ELEMENT: {
				Element element = (Element)theEObject;
				T result = caseElement(element);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MolicPackage.CONNECTION: {
				Connection connection = (Connection)theEObject;
				T result = caseConnection(connection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MolicPackage.SCENE: {
				Scene scene = (Scene)theEObject;
				T result = caseScene(scene);
				if (result == null) result = caseElement(scene);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MolicPackage.UTTERANCE: {
				Utterance utterance = (Utterance)theEObject;
				T result = caseUtterance(utterance);
				if (result == null) result = caseConnection(utterance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MolicPackage.BRT_UTTERANCE: {
				BRTUtterance brtUtterance = (BRTUtterance)theEObject;
				T result = caseBRTUtterance(brtUtterance);
				if (result == null) result = caseConnection(brtUtterance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MolicPackage.SYSTEM_PROCESS: {
				SystemProcess systemProcess = (SystemProcess)theEObject;
				T result = caseSystemProcess(systemProcess);
				if (result == null) result = caseElement(systemProcess);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MolicPackage.UBIQUITOUS_ACCESS: {
				UbiquitousAccess ubiquitousAccess = (UbiquitousAccess)theEObject;
				T result = caseUbiquitousAccess(ubiquitousAccess);
				if (result == null) result = caseElement(ubiquitousAccess);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MolicPackage.OPENING_POINT: {
				OpeningPoint openingPoint = (OpeningPoint)theEObject;
				T result = caseOpeningPoint(openingPoint);
				if (result == null) result = caseElement(openingPoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MolicPackage.CLOSING_POINT: {
				ClosingPoint closingPoint = (ClosingPoint)theEObject;
				T result = caseClosingPoint(closingPoint);
				if (result == null) result = caseElement(closingPoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MolicPackage.SKETCH: {
				Sketch sketch = (Sketch)theEObject;
				T result = caseSketch(sketch);
				if (result == null) result = caseElement(sketch);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diagram</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiagram(Diagram object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElement(Element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnection(Connection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scene</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scene</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScene(Scene object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Utterance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Utterance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUtterance(Utterance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BRT Utterance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BRT Utterance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBRTUtterance(BRTUtterance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Process</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Process</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemProcess(SystemProcess object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ubiquitous Access</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ubiquitous Access</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUbiquitousAccess(UbiquitousAccess object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Opening Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Opening Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOpeningPoint(OpeningPoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Closing Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Closing Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClosingPoint(ClosingPoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sketch</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sketch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSketch(Sketch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object) {
		return null;
	}

} //MolicSwitch
