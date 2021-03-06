/**
 * Generated from platform:/resource/se.mdh.idt.benji.examples.refactorings/src/se/mdh/idt/benji/examples/refactorings/Queries.vql
 */
package se.mdh.idt.benji.examples.refactorings.internal;

import javax.annotation.Generated;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;
import se.mdh.idt.benji.examples.refactorings.AddAttributePostcondition;
import se.mdh.idt.benji.examples.refactorings.AddAttributePrecondition;
import se.mdh.idt.benji.examples.refactorings.AddClassPostcondition;
import se.mdh.idt.benji.examples.refactorings.AddClassPrecondition;
import se.mdh.idt.benji.examples.refactorings.AddPackagePostcondition;
import se.mdh.idt.benji.examples.refactorings.AddPackagePrecondition;
import se.mdh.idt.benji.examples.refactorings.AddReferencePostcondition;
import se.mdh.idt.benji.examples.refactorings.AddReferencePrecondition;
import se.mdh.idt.benji.examples.refactorings.ChangeAttributeTypePostcondition;
import se.mdh.idt.benji.examples.refactorings.ChangeAttributeTypePrecondition;
import se.mdh.idt.benji.examples.refactorings.ChangeClassAbstractPostcondition;
import se.mdh.idt.benji.examples.refactorings.ChangeClassAbstractPrecondition;
import se.mdh.idt.benji.examples.refactorings.ChangeReferenceTypePostcondition;
import se.mdh.idt.benji.examples.refactorings.ChangeReferenceTypePrecondition;
import se.mdh.idt.benji.examples.refactorings.DeleteAttributePostcondition;
import se.mdh.idt.benji.examples.refactorings.DeleteAttributePrecondition;
import se.mdh.idt.benji.examples.refactorings.DeleteClassPostcondition;
import se.mdh.idt.benji.examples.refactorings.DeleteClassPrecondition;
import se.mdh.idt.benji.examples.refactorings.DeletePackagePostcondition;
import se.mdh.idt.benji.examples.refactorings.DeletePackagePrecondition;
import se.mdh.idt.benji.examples.refactorings.DeleteReferencePostcondition;
import se.mdh.idt.benji.examples.refactorings.DeleteReferencePrecondition;
import se.mdh.idt.benji.examples.refactorings.ExtractClassPostcondition;
import se.mdh.idt.benji.examples.refactorings.ExtractClassPrecondition;
import se.mdh.idt.benji.examples.refactorings.ExtractSuperclassPostcondition;
import se.mdh.idt.benji.examples.refactorings.ExtractSuperclassPrecondition;
import se.mdh.idt.benji.examples.refactorings.MergeClassesPostcondition;
import se.mdh.idt.benji.examples.refactorings.MergeClassesPrecondition;
import se.mdh.idt.benji.examples.refactorings.MergeReferencesPostcondition;
import se.mdh.idt.benji.examples.refactorings.MergeReferencesPrecondition;
import se.mdh.idt.benji.examples.refactorings.PushDownAttributePostcondition;
import se.mdh.idt.benji.examples.refactorings.PushDownAttributePrecondition;
import se.mdh.idt.benji.examples.refactorings.RenameClassPostcondition;
import se.mdh.idt.benji.examples.refactorings.RenameClassPrecondition;
import se.mdh.idt.benji.examples.refactorings.RenamePackagePostcondition;
import se.mdh.idt.benji.examples.refactorings.RenamePackagePrecondition;
import se.mdh.idt.benji.examples.refactorings.RenameURIPackagePostcondition;
import se.mdh.idt.benji.examples.refactorings.RenameURIPackagePrecondition;
import se.mdh.idt.benji.examples.refactorings.RestrictReferencePostcondition;
import se.mdh.idt.benji.examples.refactorings.RestrictReferencePrecondition;
import se.mdh.idt.benji.examples.refactorings.internal.Change_attribute_type;
import se.mdh.idt.benji.examples.refactorings.internal.Change_reference_type;
import se.mdh.idt.benji.examples.refactorings.internal.Create_class_attribute;
import se.mdh.idt.benji.examples.refactorings.internal.Create_class_reference;
import se.mdh.idt.benji.examples.refactorings.internal.Create_package_class;
import se.mdh.idt.benji.examples.refactorings.internal.Create_package_subPackage;
import se.mdh.idt.benji.examples.refactorings.internal.Delete_class_attribute;
import se.mdh.idt.benji.examples.refactorings.internal.Delete_class_attribute_difference;
import se.mdh.idt.benji.examples.refactorings.internal.Delete_class_attribute_intersection;
import se.mdh.idt.benji.examples.refactorings.internal.Delete_class_attribute_name;
import se.mdh.idt.benji.examples.refactorings.internal.Delete_class_reference;
import se.mdh.idt.benji.examples.refactorings.internal.Delete_class_reference_difference;
import se.mdh.idt.benji.examples.refactorings.internal.Delete_class_reference_intersection;
import se.mdh.idt.benji.examples.refactorings.internal.Delete_class_reference_name;
import se.mdh.idt.benji.examples.refactorings.internal.Delete_package_class;
import se.mdh.idt.benji.examples.refactorings.internal.Get_class_superClass_intersection;
import se.mdh.idt.benji.examples.refactorings.internal.Merge_attribute_name;
import se.mdh.idt.benji.examples.refactorings.internal.Merge_attribute_type;
import se.mdh.idt.benji.examples.refactorings.internal.Merge_class_attribute;
import se.mdh.idt.benji.examples.refactorings.internal.Merge_class_attribute_intersection;
import se.mdh.idt.benji.examples.refactorings.internal.Merge_class_reference;
import se.mdh.idt.benji.examples.refactorings.internal.Merge_class_reference_intersection;
import se.mdh.idt.benji.examples.refactorings.internal.Merge_reference_name;
import se.mdh.idt.benji.examples.refactorings.internal.Merge_reference_type;
import se.mdh.idt.benji.examples.refactorings.internal.Move_attribute_name;
import se.mdh.idt.benji.examples.refactorings.internal.Move_attribute_type;
import se.mdh.idt.benji.examples.refactorings.internal.Move_class_attribute;
import se.mdh.idt.benji.examples.refactorings.internal.Move_class_attribute_difference;
import se.mdh.idt.benji.examples.refactorings.internal.Move_class_reference;
import se.mdh.idt.benji.examples.refactorings.internal.Move_class_reference_difference;
import se.mdh.idt.benji.examples.refactorings.internal.Move_reference_name;
import se.mdh.idt.benji.examples.refactorings.internal.Move_reference_type;

/**
 * A pattern group formed of all patterns defined in Queries.vql.
 * 
 * <p>A private group that includes private patterns as well. Only intended use case is for pattern testing.
 * 
 * <p> From package se.mdh.idt.benji.examples.refactorings, the group contains the definition of the following patterns: <ul>
 * <li>RenamePackagePrecondition</li>
 * <li>RenamePackagePostcondition</li>
 * <li>RenameURIPackagePrecondition</li>
 * <li>RenameURIPackagePostcondition</li>
 * <li>DeletePackagePrecondition</li>
 * <li>DeletePackagePostcondition</li>
 * <li>AddPackagePrecondition</li>
 * <li>AddPackagePostcondition</li>
 * <li>AddClassPrecondition</li>
 * <li>AddClassPostcondition</li>
 * <li>RenameClassPrecondition</li>
 * <li>RenameClassPostcondition</li>
 * <li>DeleteClassPrecondition</li>
 * <li>DeleteClassPostcondition</li>
 * <li>ExtractClassPrecondition</li>
 * <li>ExtractClassPostcondition</li>
 * <li>MergeClassesPrecondition</li>
 * <li>MergeClassesPostcondition</li>
 * <li>AddAttributePrecondition</li>
 * <li>AddAttributePostcondition</li>
 * <li>DeleteAttributePrecondition</li>
 * <li>DeleteAttributePostcondition</li>
 * <li>ChangeAttributeTypePrecondition</li>
 * <li>ChangeAttributeTypePostcondition</li>
 * <li>AddReferencePrecondition</li>
 * <li>AddReferencePostcondition</li>
 * <li>DeleteReferencePrecondition</li>
 * <li>DeleteReferencePostcondition</li>
 * <li>MergeReferencesPrecondition</li>
 * <li>MergeReferencesPostcondition</li>
 * <li>ChangeReferenceTypePrecondition</li>
 * <li>ChangeReferenceTypePostcondition</li>
 * <li>ExtractSuperclassPrecondition</li>
 * <li>ExtractSuperclassPostcondition</li>
 * <li>ChangeClassAbstractPrecondition</li>
 * <li>ChangeClassAbstractPostcondition</li>
 * <li>RestrictReferencePrecondition</li>
 * <li>RestrictReferencePostcondition</li>
 * <li>PushDownAttributePrecondition</li>
 * <li>PushDownAttributePostcondition</li>
 * <li>create_package_class</li>
 * <li>create_package_subPackage</li>
 * <li>create_class_attribute</li>
 * <li>create_class_reference</li>
 * <li>delete_package_class</li>
 * <li>delete_class_attribute_intersection</li>
 * <li>delete_class_reference_intersection</li>
 * <li>delete_class_attribute_difference</li>
 * <li>delete_class_reference_difference</li>
 * <li>delete_class_attribute_name</li>
 * <li>delete_class_reference_name</li>
 * <li>delete_class_attribute</li>
 * <li>delete_class_reference</li>
 * <li>merge_class_attribute_intersection</li>
 * <li>merge_class_reference_intersection</li>
 * <li>move_class_attribute_difference</li>
 * <li>move_class_reference_difference</li>
 * <li>merge_class_attribute</li>
 * <li>merge_class_reference</li>
 * <li>move_class_attribute</li>
 * <li>move_class_reference</li>
 * <li>merge_attribute_name</li>
 * <li>merge_reference_name</li>
 * <li>move_attribute_name</li>
 * <li>move_reference_name</li>
 * <li>merge_attribute_type</li>
 * <li>merge_reference_type</li>
 * <li>move_attribute_type</li>
 * <li>move_reference_type</li>
 * <li>change_attribute_type</li>
 * <li>change_reference_type</li>
 * <li>get_class_superClass_intersection</li>
 * </ul>
 * 
 * @see IPatternGroup
 * 
 */
@SuppressWarnings("all")
@Generated(value = "org.eclipse.xtext.xbase.compiler.JvmModelGenerator", date = "2018-03-25T16:29+0200")
public final class QueriesAll extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws ViatraQueryRuntimeException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static QueriesAll instance() {
    if (INSTANCE == null) {
        INSTANCE = new QueriesAll();
    }
    return INSTANCE;
  }
  
  private static QueriesAll INSTANCE;
  
  private QueriesAll() {
    querySpecifications.add(RenamePackagePrecondition.instance());
    querySpecifications.add(RenamePackagePostcondition.instance());
    querySpecifications.add(RenameURIPackagePrecondition.instance());
    querySpecifications.add(RenameURIPackagePostcondition.instance());
    querySpecifications.add(DeletePackagePrecondition.instance());
    querySpecifications.add(DeletePackagePostcondition.instance());
    querySpecifications.add(AddPackagePrecondition.instance());
    querySpecifications.add(AddPackagePostcondition.instance());
    querySpecifications.add(AddClassPrecondition.instance());
    querySpecifications.add(AddClassPostcondition.instance());
    querySpecifications.add(RenameClassPrecondition.instance());
    querySpecifications.add(RenameClassPostcondition.instance());
    querySpecifications.add(DeleteClassPrecondition.instance());
    querySpecifications.add(DeleteClassPostcondition.instance());
    querySpecifications.add(ExtractClassPrecondition.instance());
    querySpecifications.add(ExtractClassPostcondition.instance());
    querySpecifications.add(MergeClassesPrecondition.instance());
    querySpecifications.add(MergeClassesPostcondition.instance());
    querySpecifications.add(AddAttributePrecondition.instance());
    querySpecifications.add(AddAttributePostcondition.instance());
    querySpecifications.add(DeleteAttributePrecondition.instance());
    querySpecifications.add(DeleteAttributePostcondition.instance());
    querySpecifications.add(ChangeAttributeTypePrecondition.instance());
    querySpecifications.add(ChangeAttributeTypePostcondition.instance());
    querySpecifications.add(AddReferencePrecondition.instance());
    querySpecifications.add(AddReferencePostcondition.instance());
    querySpecifications.add(DeleteReferencePrecondition.instance());
    querySpecifications.add(DeleteReferencePostcondition.instance());
    querySpecifications.add(MergeReferencesPrecondition.instance());
    querySpecifications.add(MergeReferencesPostcondition.instance());
    querySpecifications.add(ChangeReferenceTypePrecondition.instance());
    querySpecifications.add(ChangeReferenceTypePostcondition.instance());
    querySpecifications.add(ExtractSuperclassPrecondition.instance());
    querySpecifications.add(ExtractSuperclassPostcondition.instance());
    querySpecifications.add(ChangeClassAbstractPrecondition.instance());
    querySpecifications.add(ChangeClassAbstractPostcondition.instance());
    querySpecifications.add(RestrictReferencePrecondition.instance());
    querySpecifications.add(RestrictReferencePostcondition.instance());
    querySpecifications.add(PushDownAttributePrecondition.instance());
    querySpecifications.add(PushDownAttributePostcondition.instance());
    querySpecifications.add(Create_package_class.instance());
    querySpecifications.add(Create_package_subPackage.instance());
    querySpecifications.add(Create_class_attribute.instance());
    querySpecifications.add(Create_class_reference.instance());
    querySpecifications.add(Delete_package_class.instance());
    querySpecifications.add(Delete_class_attribute_intersection.instance());
    querySpecifications.add(Delete_class_reference_intersection.instance());
    querySpecifications.add(Delete_class_attribute_difference.instance());
    querySpecifications.add(Delete_class_reference_difference.instance());
    querySpecifications.add(Delete_class_attribute_name.instance());
    querySpecifications.add(Delete_class_reference_name.instance());
    querySpecifications.add(Delete_class_attribute.instance());
    querySpecifications.add(Delete_class_reference.instance());
    querySpecifications.add(Merge_class_attribute_intersection.instance());
    querySpecifications.add(Merge_class_reference_intersection.instance());
    querySpecifications.add(Move_class_attribute_difference.instance());
    querySpecifications.add(Move_class_reference_difference.instance());
    querySpecifications.add(Merge_class_attribute.instance());
    querySpecifications.add(Merge_class_reference.instance());
    querySpecifications.add(Move_class_attribute.instance());
    querySpecifications.add(Move_class_reference.instance());
    querySpecifications.add(Merge_attribute_name.instance());
    querySpecifications.add(Merge_reference_name.instance());
    querySpecifications.add(Move_attribute_name.instance());
    querySpecifications.add(Move_reference_name.instance());
    querySpecifications.add(Merge_attribute_type.instance());
    querySpecifications.add(Merge_reference_type.instance());
    querySpecifications.add(Move_attribute_type.instance());
    querySpecifications.add(Move_reference_type.instance());
    querySpecifications.add(Change_attribute_type.instance());
    querySpecifications.add(Change_reference_type.instance());
    querySpecifications.add(Get_class_superClass_intersection.instance());
  }
}
