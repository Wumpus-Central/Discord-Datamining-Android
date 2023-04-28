package p142hi;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: hi.j */
/* loaded from: classes8.dex */
public enum EnumC8038j {
    UNRESOLVED_TYPE("Unresolved type for %s", true),
    UNRESOLVED_TYPE_PARAMETER_TYPE("Unresolved type parameter type", true),
    UNRESOLVED_CLASS_TYPE("Unresolved class %s", true),
    UNRESOLVED_JAVA_CLASS("Unresolved java class %s", true),
    UNRESOLVED_DECLARATION("Unresolved declaration %s", true),
    UNRESOLVED_KCLASS_CONSTANT_VALUE("Unresolved type for %s (arrayDimensions=%s)", true),
    UNRESOLVED_TYPE_ALIAS("Unresolved type alias %s", false, 2, null),
    RETURN_TYPE("Return type for %s cannot be resolved", false, 2, null),
    RETURN_TYPE_FOR_FUNCTION("Return type for function cannot be resolved", false, 2, null),
    RETURN_TYPE_FOR_PROPERTY("Return type for property %s cannot be resolved", false, 2, null),
    RETURN_TYPE_FOR_CONSTRUCTOR("Return type for constructor %s cannot be resolved", false, 2, null),
    IMPLICIT_RETURN_TYPE_FOR_FUNCTION("Implicit return type for function %s cannot be resolved", false, 2, null),
    IMPLICIT_RETURN_TYPE_FOR_PROPERTY("Implicit return type for property %s cannot be resolved", false, 2, null),
    IMPLICIT_RETURN_TYPE_FOR_PROPERTY_ACCESSOR("Implicit return type for property accessor %s cannot be resolved", false, 2, null),
    ERROR_TYPE_FOR_DESTRUCTURING_COMPONENT("%s() return type", false, 2, null),
    RECURSIVE_TYPE("Recursive type", false, 2, null),
    RECURSIVE_TYPE_ALIAS("Recursive type alias %s", false, 2, null),
    RECURSIVE_ANNOTATION_TYPE("Recursive annotation's type", false, 2, null),
    CYCLIC_UPPER_BOUNDS("Cyclic upper bounds", false, 2, null),
    CYCLIC_SUPERTYPES("Cyclic supertypes", false, 2, null),
    UNINFERRED_LAMBDA_CONTEXT_RECEIVER_TYPE("Cannot infer a lambda context receiver type", false, 2, null),
    UNINFERRED_LAMBDA_PARAMETER_TYPE("Cannot infer a lambda parameter type", false, 2, null),
    UNINFERRED_TYPE_VARIABLE("Cannot infer a type variable %s", false, 2, null),
    RESOLUTION_ERROR_TYPE("Resolution error type (%s)", false, 2, null),
    ERROR_EXPECTED_TYPE("Error expected type", false, 2, null),
    ERROR_DATA_FLOW_TYPE("Error type for data flow", false, 2, null),
    ERROR_WHILE_RECONSTRUCTING_BARE_TYPE("Failed to reconstruct type %s", false, 2, null),
    UNABLE_TO_SUBSTITUTE_TYPE("Unable to substitute type (%s)", false, 2, null),
    DONT_CARE("Special DONT_CARE type", false, 2, null),
    STUB_TYPE("Stub type %s", false, 2, null),
    FUNCTION_PLACEHOLDER_TYPE("Function placeholder type (arguments: %s)", false, 2, null),
    TYPE_FOR_RESULT("Stubbed 'Result' type", false, 2, null),
    TYPE_FOR_COMPILER_EXCEPTION("Error type for a compiler exception while analyzing %s", false, 2, null),
    ERROR_FLEXIBLE_TYPE("Error java flexible type with id %s. (%s..%s)", false, 2, null),
    ERROR_RAW_TYPE("Error raw type %s", false, 2, null),
    TYPE_WITH_MISMATCHED_TYPE_ARGUMENTS_AND_PARAMETERS("Inconsistent type %s (parameters.size = %s, arguments.size = %s)", false, 2, null),
    ILLEGAL_TYPE_RANGE_FOR_DYNAMIC("Illegal type range for dynamic type %s..%s", false, 2, null),
    CANNOT_LOAD_DESERIALIZE_TYPE_PARAMETER("Unknown type parameter %s. Please try recompiling module containing \"%s\"", false, 2, null),
    CANNOT_LOAD_DESERIALIZE_TYPE_PARAMETER_BY_NAME("Couldn't deserialize type parameter %s in %s", false, 2, null),
    INCONSISTENT_SUSPEND_FUNCTION("Inconsistent suspend function type in metadata with constructor %s", false, 2, null),
    UNEXPECTED_FLEXIBLE_TYPE_ID("Unexpected id of a flexible type %s. (%s..%s)", false, 2, null),
    UNKNOWN_TYPE("Unknown type", false, 2, null),
    NO_TYPE_SPECIFIED("No type specified for %s", false, 2, null),
    NO_TYPE_FOR_LOOP_RANGE("Loop range has no type", false, 2, null),
    NO_TYPE_FOR_LOOP_PARAMETER("Loop parameter has no type", false, 2, null),
    MISSED_TYPE_FOR_PARAMETER("Missed a type for a value parameter %s", false, 2, null),
    MISSED_TYPE_ARGUMENT_FOR_TYPE_PARAMETER("Missed a type argument for a type parameter %s", false, 2, null),
    PARSE_ERROR_ARGUMENT("Error type for parse error argument %s", false, 2, null),
    STAR_PROJECTION_IN_CALL("Error type for star projection directly passing as a call type argument", false, 2, null),
    PROHIBITED_DYNAMIC_TYPE("Dynamic type in a not allowed context", false, 2, null),
    NOT_ANNOTATION_TYPE_IN_ANNOTATION_CONTEXT("Not an annotation type %s in the annotation context", false, 2, null),
    UNIT_RETURN_TYPE_FOR_INC_DEC("Unit type returned by inc or dec", false, 2, null),
    RETURN_NOT_ALLOWED("Return not allowed", false, 2, null),
    UNRESOLVED_PARCEL_TYPE("Unresolved 'Parcel' type", true),
    KAPT_ERROR_TYPE("Kapt error type", false, 2, null),
    SYNTHETIC_ELEMENT_ERROR_TYPE("Error type for synthetic element", false, 2, null),
    AD_HOC_ERROR_TYPE_FOR_LIGHTER_CLASSES_RESOLVE("Error type in ad hoc resolve for lighter classes", false, 2, null),
    ERROR_EXPRESSION_TYPE("Error expression type", false, 2, null),
    ERROR_RECEIVER_TYPE("Error receiver type for %s", false, 2, null),
    ERROR_CONSTANT_VALUE("Error constant value %s", false, 2, null),
    EMPTY_CALLABLE_REFERENCE("Empty callable reference", false, 2, null),
    UNSUPPORTED_CALLABLE_REFERENCE_TYPE("Unsupported callable reference type %s", false, 2, null),
    TYPE_FOR_DELEGATION("Error delegation type for %s", false, 2, null),
    UNAVAILABLE_TYPE_FOR_DECLARATION("Type is unavailable for declaration %s", false, 2, null),
    ERROR_TYPE_PARAMETER("Error type parameter", false, 2, null),
    ERROR_TYPE_PROJECTION("Error type projection", false, 2, null),
    ERROR_SUPER_TYPE("Error super type", false, 2, null),
    SUPER_TYPE_FOR_ERROR_TYPE("Supertype of error type %s", false, 2, null),
    ERROR_PROPERTY_TYPE("Error property type", false, 2, null),
    ERROR_CLASS("Error class", false, 2, null),
    TYPE_FOR_ERROR_TYPE_CONSTRUCTOR("Type for error type constructor (%s)", false, 2, null),
    INTERSECTION_OF_ERROR_TYPES("Intersection of error types %s", false, 2, null),
    CANNOT_COMPUTE_ERASED_BOUND("Cannot compute erased upper bound of a type parameter %s", false, 2, null),
    NOT_FOUND_UNSIGNED_TYPE("Unsigned type %s not found", false, 2, null),
    ERROR_ENUM_TYPE("Not found the corresponding enum class for given enum entry %s.%s", false, 2, null),
    NO_RECORDED_TYPE("Not found recorded type for %s", false, 2, null),
    NOT_FOUND_DESCRIPTOR_FOR_FUNCTION("Descriptor not found for function %s", false, 2, null),
    NOT_FOUND_DESCRIPTOR_FOR_CLASS("Cannot build class type, descriptor not found for builder %s", false, 2, null),
    NOT_FOUND_DESCRIPTOR_FOR_TYPE_PARAMETER("Cannot build type parameter type, descriptor not found for builder %s", false, 2, null),
    UNMAPPED_ANNOTATION_TARGET_TYPE("Type for unmapped Java annotation target to Kotlin one", false, 2, null),
    UNKNOWN_ARRAY_ELEMENT_TYPE_OF_ANNOTATION_ARGUMENT("Unknown type for an array element of a java annotation argument", false, 2, null),
    NOT_FOUND_FQNAME_FOR_JAVA_ANNOTATION("No fqName for annotation %s", false, 2, null),
    NOT_FOUND_FQNAME("No fqName for %s", false, 2, null),
    TYPE_FOR_GENERATED_ERROR_EXPRESSION("Type for generated error expression", false, 2, null);
    

    /* renamed from: k */
    private final String f17406k;

    /* renamed from: l */
    private final boolean f17407l;

    EnumC8038j(String str, boolean z) {
        this.f17406k = str;
        this.f17407l = z;
    }

    /* renamed from: b */
    public final String m20779b() {
        return this.f17406k;
    }

    /* renamed from: c */
    public final boolean m20778c() {
        return this.f17407l;
    }

    /* synthetic */ EnumC8038j(String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? false : z);
    }
}
