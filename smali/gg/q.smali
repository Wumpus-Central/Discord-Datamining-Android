.class public final Lgg/q;
.super Lgg/l;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/internal/l;
.implements Lkotlin/reflect/KFunction;
.implements Lgg/i;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lgg/l<",
        "Ljava/lang/Object;",
        ">;",
        "Lkotlin/jvm/internal/l<",
        "Ljava/lang/Object;",
        ">;",
        "Lkotlin/reflect/KFunction<",
        "Ljava/lang/Object;",
        ">;",
        "Lgg/i;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000f\n\u0002\u0018\u0002\n\u0002\u0008\u001f\u0008\u0000\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00032\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00042\u00020\u0005B\u0019\u0008\u0016\u0012\u0006\u0010\u001e\u001a\u00020\u0019\u0012\u0006\u0010\u000e\u001a\u00020\r\u00a2\u0006\u0004\u0008C\u0010DB7\u0008\u0002\u0012\u0006\u0010\u001e\u001a\u00020\u0019\u0012\u0006\u0010:\u001a\u00020\u0017\u0012\u0006\u0010!\u001a\u00020\u0017\u0012\u0008\u0010E\u001a\u0004\u0018\u00010\r\u0012\n\u0008\u0002\u0010$\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\u0008C\u0010FB+\u0008\u0016\u0012\u0006\u0010\u001e\u001a\u00020\u0019\u0012\u0006\u0010:\u001a\u00020\u0017\u0012\u0006\u0010!\u001a\u00020\u0017\u0012\u0008\u00104\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\u0008C\u0010GJ\u0010\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\n\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\u000b\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J.\u0010\u0012\u001a\u000c\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u000c0\u00112\n\u0010\u0007\u001a\u0006\u0012\u0002\u0008\u00030\u000c2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\u0013\u0010\u0014\u001a\u00020\u000f2\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\u0008\u0010\u0016\u001a\u00020\u0015H\u0016J\u0008\u0010\u0018\u001a\u00020\u0017H\u0016R\u001a\u0010\u001e\u001a\u00020\u00198\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u001b\u001a\u0004\u0008\u001c\u0010\u001dR\u0014\u0010!\u001a\u00020\u00178\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010 R\u0016\u0010$\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\"\u0010#R\u001b\u0010\u000e\u001a\u00020\r8VX\u0096\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008%\u0010&\u001a\u0004\u0008\'\u0010(R\u001f\u0010.\u001a\u0006\u0012\u0002\u0008\u00030)8VX\u0096\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008*\u0010+\u001a\u0004\u0008,\u0010-R!\u00101\u001a\u0008\u0012\u0002\u0008\u0003\u0018\u00010)8VX\u0096\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008/\u0010+\u001a\u0004\u00080\u0010-R\u0016\u00104\u001a\u0004\u0018\u00010\u00028BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u00082\u00103R\u0014\u00107\u001a\u00020\u000f8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u00085\u00106R\u0014\u0010:\u001a\u00020\u00178VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u00088\u00109R\u0014\u0010=\u001a\u00020\u00158VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008;\u0010<R\u0014\u0010>\u001a\u00020\u000f8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008>\u00106R\u0014\u0010?\u001a\u00020\u000f8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008?\u00106R\u0014\u0010@\u001a\u00020\u000f8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008@\u00106R\u0014\u0010A\u001a\u00020\u000f8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008A\u00106R\u0014\u0010B\u001a\u00020\u000f8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008B\u00106\u00a8\u0006H"
    }
    d2 = {
        "Lgg/q;",
        "Lgg/l;",
        "",
        "Lkotlin/reflect/KFunction;",
        "Lkotlin/jvm/internal/l;",
        "Lgg/i;",
        "Ljava/lang/reflect/Method;",
        "member",
        "Lhg/f$h;",
        "I",
        "H",
        "G",
        "Ljava/lang/reflect/Constructor;",
        "Lmg/y;",
        "descriptor",
        "",
        "isDefault",
        "Lhg/f;",
        "F",
        "other",
        "equals",
        "",
        "hashCode",
        "",
        "toString",
        "Lgg/p;",
        "o",
        "Lgg/p;",
        "v",
        "()Lgg/p;",
        "container",
        "p",
        "Ljava/lang/String;",
        "signature",
        "q",
        "Ljava/lang/Object;",
        "rawBoundReceiver",
        "r",
        "Lgg/j0$a;",
        "getDescriptor",
        "()Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;",
        "Lhg/e;",
        "s",
        "Lgg/j0$b;",
        "u",
        "()Lhg/e;",
        "caller",
        "t",
        "w",
        "defaultCaller",
        "J",
        "()Ljava/lang/Object;",
        "boundReceiver",
        "z",
        "()Z",
        "isBound",
        "getName",
        "()Ljava/lang/String;",
        "name",
        "getArity",
        "()I",
        "arity",
        "isInline",
        "isExternal",
        "isOperator",
        "isInfix",
        "isSuspend",
        "<init>",
        "(Lgg/p;Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;)V",
        "descriptorInitialValue",
        "(Lgg/p;Ljava/lang/String;Ljava/lang/String;Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;Ljava/lang/Object;)V",
        "(Lgg/p;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V",
        "kotlin-reflection"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field static final synthetic u:[Lkotlin/reflect/KProperty;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Lkotlin/reflect/KProperty<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final o:Lgg/p;

.field private final p:Ljava/lang/String;

.field private final q:Ljava/lang/Object;

.field private final r:Lgg/j0$a;

.field private final s:Lgg/j0$b;

.field private final t:Lgg/j0$b;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    const/4 v0, 0x3

    .line 2
    new-array v0, v0, [Lkotlin/reflect/KProperty;

    .line 3
    .line 4
    new-instance v1, Lkotlin/jvm/internal/c0;

    .line 5
    .line 6
    const-class v2, Lgg/q;

    .line 7
    .line 8
    invoke-static {v2}, Lkotlin/jvm/internal/f0;->b(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 9
    .line 10
    .line 11
    move-result-object v3

    .line 12
    const-string v4, "descriptor"

    .line 13
    .line 14
    const-string v5, "getDescriptor()Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;"

    .line 15
    .line 16
    invoke-direct {v1, v3, v4, v5}, Lkotlin/jvm/internal/c0;-><init>(Lkotlin/reflect/KDeclarationContainer;Ljava/lang/String;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-static {v1}, Lkotlin/jvm/internal/f0;->g(Lkotlin/jvm/internal/b0;)Ldg/h;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    const/4 v3, 0x0

    .line 24
    aput-object v1, v0, v3

    .line 25
    .line 26
    new-instance v1, Lkotlin/jvm/internal/c0;

    .line 27
    .line 28
    invoke-static {v2}, Lkotlin/jvm/internal/f0;->b(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    const-string v4, "caller"

    .line 33
    .line 34
    const-string v5, "getCaller()Lkotlin/reflect/jvm/internal/calls/Caller;"

    .line 35
    .line 36
    invoke-direct {v1, v3, v4, v5}, Lkotlin/jvm/internal/c0;-><init>(Lkotlin/reflect/KDeclarationContainer;Ljava/lang/String;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    invoke-static {v1}, Lkotlin/jvm/internal/f0;->g(Lkotlin/jvm/internal/b0;)Ldg/h;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    const/4 v3, 0x1

    .line 44
    aput-object v1, v0, v3

    .line 45
    .line 46
    new-instance v1, Lkotlin/jvm/internal/c0;

    .line 47
    .line 48
    invoke-static {v2}, Lkotlin/jvm/internal/f0;->b(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    const-string v3, "defaultCaller"

    .line 53
    .line 54
    const-string v4, "getDefaultCaller()Lkotlin/reflect/jvm/internal/calls/Caller;"

    .line 55
    .line 56
    invoke-direct {v1, v2, v3, v4}, Lkotlin/jvm/internal/c0;-><init>(Lkotlin/reflect/KDeclarationContainer;Ljava/lang/String;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    invoke-static {v1}, Lkotlin/jvm/internal/f0;->g(Lkotlin/jvm/internal/b0;)Ldg/h;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    const/4 v2, 0x2

    .line 64
    aput-object v1, v0, v2

    .line 65
    .line 66
    sput-object v0, Lgg/q;->u:[Lkotlin/reflect/KProperty;

    .line 67
    .line 68
    return-void
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
.end method

.method public constructor <init>(Lgg/p;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 7

    const-string v0, "container"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "name"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "signature"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v6, p4

    .line 10
    invoke-direct/range {v1 .. v6}, Lgg/q;-><init>(Lgg/p;Ljava/lang/String;Ljava/lang/String;Lmg/y;Ljava/lang/Object;)V

    return-void
.end method

.method private constructor <init>(Lgg/p;Ljava/lang/String;Ljava/lang/String;Lmg/y;Ljava/lang/Object;)V
    .locals 0

    .line 3
    invoke-direct {p0}, Lgg/l;-><init>()V

    .line 4
    iput-object p1, p0, Lgg/q;->o:Lgg/p;

    .line 5
    iput-object p3, p0, Lgg/q;->p:Ljava/lang/String;

    .line 6
    iput-object p5, p0, Lgg/q;->q:Ljava/lang/Object;

    .line 7
    new-instance p1, Lgg/q$c;

    invoke-direct {p1, p0, p2}, Lgg/q$c;-><init>(Lgg/q;Ljava/lang/String;)V

    invoke-static {p4, p1}, Lgg/j0;->c(Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Lgg/j0$a;

    move-result-object p1

    iput-object p1, p0, Lgg/q;->r:Lgg/j0$a;

    .line 8
    new-instance p1, Lgg/q$a;

    invoke-direct {p1, p0}, Lgg/q$a;-><init>(Lgg/q;)V

    invoke-static {p1}, Lgg/j0;->b(Lkotlin/jvm/functions/Function0;)Lgg/j0$b;

    move-result-object p1

    iput-object p1, p0, Lgg/q;->s:Lgg/j0$b;

    .line 9
    new-instance p1, Lgg/q$b;

    invoke-direct {p1, p0}, Lgg/q$b;-><init>(Lgg/q;)V

    invoke-static {p1}, Lgg/j0;->b(Lkotlin/jvm/functions/Function0;)Lgg/j0$b;

    move-result-object p1

    iput-object p1, p0, Lgg/q;->t:Lgg/j0$b;

    return-void
.end method

.method synthetic constructor <init>(Lgg/p;Ljava/lang/String;Ljava/lang/String;Lmg/y;Ljava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_0

    .line 1
    sget-object p5, Lkotlin/jvm/internal/e;->NO_RECEIVER:Ljava/lang/Object;

    :cond_0
    move-object v5, p5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    .line 2
    invoke-direct/range {v0 .. v5}, Lgg/q;-><init>(Lgg/p;Ljava/lang/String;Ljava/lang/String;Lmg/y;Ljava/lang/Object;)V

    return-void
.end method

.method public constructor <init>(Lgg/p;Lmg/y;)V
    .locals 9

    const-string v0, "container"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "descriptor"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    invoke-interface {p2}, Lmg/j0;->getName()Llh/f;

    move-result-object v0

    invoke-virtual {v0}, Llh/f;->b()Ljava/lang/String;

    move-result-object v3

    const-string v0, "descriptor.name.asString()"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    sget-object v0, Lgg/m0;->a:Lgg/m0;

    invoke-virtual {v0, p2}, Lgg/m0;->g(Lmg/y;)Lgg/j;

    move-result-object v0

    invoke-virtual {v0}, Lgg/j;->a()Ljava/lang/String;

    move-result-object v4

    const/4 v6, 0x0

    const/16 v7, 0x10

    const/4 v8, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v5, p2

    .line 13
    invoke-direct/range {v1 .. v8}, Lgg/q;-><init>(Lgg/p;Ljava/lang/String;Ljava/lang/String;Lmg/y;Ljava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public static final synthetic A(Lgg/q;Ljava/lang/reflect/Constructor;Lmg/y;Z)Lhg/f;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lgg/q;->F(Ljava/lang/reflect/Constructor;Lmg/y;Z)Lhg/f;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic B(Lgg/q;Ljava/lang/reflect/Method;)Lhg/f$h;
    .locals 0

    invoke-direct {p0, p1}, Lgg/q;->G(Ljava/lang/reflect/Method;)Lhg/f$h;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic C(Lgg/q;Ljava/lang/reflect/Method;)Lhg/f$h;
    .locals 0

    invoke-direct {p0, p1}, Lgg/q;->H(Ljava/lang/reflect/Method;)Lhg/f$h;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic D(Lgg/q;Ljava/lang/reflect/Method;)Lhg/f$h;
    .locals 0

    invoke-direct {p0, p1}, Lgg/q;->I(Ljava/lang/reflect/Method;)Lhg/f$h;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic E(Lgg/q;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lgg/q;->p:Ljava/lang/String;

    return-object p0
.end method

.method private final F(Ljava/lang/reflect/Constructor;Lmg/y;Z)Lhg/f;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/Constructor<",
            "*>;",
            "Lmg/y;",
            "Z)",
            "Lhg/f<",
            "Ljava/lang/reflect/Constructor<",
            "*>;>;"
        }
    .end annotation

    .line 1
    if-nez p3, :cond_1

    .line 2
    .line 3
    invoke-static {p2}, Luh/b;->f(Lmg/b;)Z

    .line 4
    .line 5
    .line 6
    move-result p2

    .line 7
    if-eqz p2, :cond_1

    .line 8
    .line 9
    invoke-virtual {p0}, Lgg/q;->z()Z

    .line 10
    .line 11
    .line 12
    move-result p2

    .line 13
    if-eqz p2, :cond_0

    .line 14
    .line 15
    new-instance p2, Lhg/f$a;

    .line 16
    .line 17
    invoke-direct {p0}, Lgg/q;->J()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p3

    .line 21
    invoke-direct {p2, p1, p3}, Lhg/f$a;-><init>(Ljava/lang/reflect/Constructor;Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    new-instance p2, Lhg/f$b;

    .line 26
    .line 27
    invoke-direct {p2, p1}, Lhg/f$b;-><init>(Ljava/lang/reflect/Constructor;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    invoke-virtual {p0}, Lgg/q;->z()Z

    .line 32
    .line 33
    .line 34
    move-result p2

    .line 35
    if-eqz p2, :cond_2

    .line 36
    .line 37
    new-instance p2, Lhg/f$c;

    .line 38
    .line 39
    invoke-direct {p0}, Lgg/q;->J()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p3

    .line 43
    invoke-direct {p2, p1, p3}, Lhg/f$c;-><init>(Ljava/lang/reflect/Constructor;Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_2
    new-instance p2, Lhg/f$e;

    .line 48
    .line 49
    invoke-direct {p2, p1}, Lhg/f$e;-><init>(Ljava/lang/reflect/Constructor;)V

    .line 50
    .line 51
    .line 52
    :goto_0
    return-object p2
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
.end method

.method private final G(Ljava/lang/reflect/Method;)Lhg/f$h;
    .locals 2

    invoke-virtual {p0}, Lgg/q;->z()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lhg/f$h$a;

    invoke-direct {p0}, Lgg/q;->J()Ljava/lang/Object;

    move-result-object v1

    invoke-direct {v0, p1, v1}, Lhg/f$h$a;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance v0, Lhg/f$h$d;

    invoke-direct {v0, p1}, Lhg/f$h$d;-><init>(Ljava/lang/reflect/Method;)V

    :goto_0
    return-object v0
.end method

.method private final H(Ljava/lang/reflect/Method;)Lhg/f$h;
    .locals 1

    invoke-virtual {p0}, Lgg/q;->z()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lhg/f$h$b;

    invoke-direct {v0, p1}, Lhg/f$h$b;-><init>(Ljava/lang/reflect/Method;)V

    goto :goto_0

    :cond_0
    new-instance v0, Lhg/f$h$e;

    invoke-direct {v0, p1}, Lhg/f$h$e;-><init>(Ljava/lang/reflect/Method;)V

    :goto_0
    return-object v0
.end method

.method private final I(Ljava/lang/reflect/Method;)Lhg/f$h;
    .locals 2

    invoke-virtual {p0}, Lgg/q;->z()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lhg/f$h$c;

    invoke-direct {p0}, Lgg/q;->J()Ljava/lang/Object;

    move-result-object v1

    invoke-direct {v0, p1, v1}, Lhg/f$h$c;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance v0, Lhg/f$h$f;

    invoke-direct {v0, p1}, Lhg/f$h$f;-><init>(Ljava/lang/reflect/Method;)V

    :goto_0
    return-object v0
.end method

.method private final J()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lgg/q;->q:Ljava/lang/Object;

    invoke-virtual {p0}, Lgg/q;->K()Lmg/y;

    move-result-object v1

    invoke-static {v0, v1}, Lhg/i;->a(Ljava/lang/Object;Lmg/b;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public K()Lmg/y;
    .locals 3

    iget-object v0, p0, Lgg/q;->r:Lgg/j0$a;

    sget-object v1, Lgg/q;->u:[Lkotlin/reflect/KProperty;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-virtual {v0, p0, v1}, Lgg/j0$c;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "<get-descriptor>(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lmg/y;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    invoke-static {p1}, Lgg/p0;->c(Ljava/lang/Object;)Lgg/q;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const/4 v0, 0x0

    .line 6
    if-nez p1, :cond_0

    .line 7
    .line 8
    return v0

    .line 9
    :cond_0
    invoke-virtual {p0}, Lgg/q;->v()Lgg/p;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {p1}, Lgg/q;->v()Lgg/p;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-static {v1, v2}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_1

    .line 22
    .line 23
    invoke-virtual {p0}, Lgg/q;->getName()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-virtual {p1}, Lgg/q;->getName()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    invoke-static {v1, v2}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-eqz v1, :cond_1

    .line 36
    .line 37
    iget-object v1, p0, Lgg/q;->p:Ljava/lang/String;

    .line 38
    .line 39
    iget-object v2, p1, Lgg/q;->p:Ljava/lang/String;

    .line 40
    .line 41
    invoke-static {v1, v2}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    if-eqz v1, :cond_1

    .line 46
    .line 47
    iget-object v1, p0, Lgg/q;->q:Ljava/lang/Object;

    .line 48
    .line 49
    iget-object p1, p1, Lgg/q;->q:Ljava/lang/Object;

    .line 50
    .line 51
    invoke-static {v1, p1}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result p1

    .line 55
    if-eqz p1, :cond_1

    .line 56
    .line 57
    const/4 v0, 0x1

    .line 58
    :cond_1
    return v0
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
.end method

.method public getArity()I
    .locals 1

    invoke-virtual {p0}, Lgg/q;->u()Lhg/e;

    move-result-object v0

    invoke-static {v0}, Lhg/g;->a(Lhg/e;)I

    move-result v0

    return v0
.end method

.method public getName()Ljava/lang/String;
    .locals 2

    invoke-virtual {p0}, Lgg/q;->K()Lmg/y;

    move-result-object v0

    invoke-interface {v0}, Lmg/j0;->getName()Llh/f;

    move-result-object v0

    invoke-virtual {v0}, Llh/f;->b()Ljava/lang/String;

    move-result-object v0

    const-string v1, "descriptor.name.asString()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    invoke-virtual {p0}, Lgg/q;->v()Lgg/p;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lgg/q;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lgg/q;->p:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-static {p0}, Lgg/i$a;->a(Lgg/i;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-static {p0, p1}, Lgg/i$a;->b(Lgg/i;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 3
    invoke-static {p0, p1, p2}, Lgg/i$a;->c(Lgg/i;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 4
    invoke-static {p0, p1, p2, p3}, Lgg/i$a;->d(Lgg/i;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 5
    invoke-static {p0, p1, p2, p3, p4}, Lgg/i$a;->e(Lgg/i;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public isExternal()Z
    .locals 1

    invoke-virtual {p0}, Lgg/q;->K()Lmg/y;

    move-result-object v0

    invoke-interface {v0}, Lmg/d0;->isExternal()Z

    move-result v0

    return v0
.end method

.method public isInfix()Z
    .locals 1

    invoke-virtual {p0}, Lgg/q;->K()Lmg/y;

    move-result-object v0

    invoke-interface {v0}, Lmg/y;->isInfix()Z

    move-result v0

    return v0
.end method

.method public isInline()Z
    .locals 1

    invoke-virtual {p0}, Lgg/q;->K()Lmg/y;

    move-result-object v0

    invoke-interface {v0}, Lmg/y;->isInline()Z

    move-result v0

    return v0
.end method

.method public isOperator()Z
    .locals 1

    invoke-virtual {p0}, Lgg/q;->K()Lmg/y;

    move-result-object v0

    invoke-interface {v0}, Lmg/y;->isOperator()Z

    move-result v0

    return v0
.end method

.method public isSuspend()Z
    .locals 1

    invoke-virtual {p0}, Lgg/q;->K()Lmg/y;

    move-result-object v0

    invoke-interface {v0}, Lmg/y;->isSuspend()Z

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    sget-object v0, Lgg/l0;->a:Lgg/l0;

    invoke-virtual {p0}, Lgg/q;->K()Lmg/y;

    move-result-object v1

    invoke-virtual {v0, v1}, Lgg/l0;->d(Lmg/y;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public u()Lhg/e;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lhg/e<",
            "*>;"
        }
    .end annotation

    iget-object v0, p0, Lgg/q;->s:Lgg/j0$b;

    sget-object v1, Lgg/q;->u:[Lkotlin/reflect/KProperty;

    const/4 v2, 0x1

    aget-object v1, v1, v2

    invoke-virtual {v0, p0, v1}, Lgg/j0$c;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "<get-caller>(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lhg/e;

    return-object v0
.end method

.method public v()Lgg/p;
    .locals 1

    iget-object v0, p0, Lgg/q;->o:Lgg/p;

    return-object v0
.end method

.method public w()Lhg/e;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lhg/e<",
            "*>;"
        }
    .end annotation

    iget-object v0, p0, Lgg/q;->t:Lgg/j0$b;

    sget-object v1, Lgg/q;->u:[Lkotlin/reflect/KProperty;

    const/4 v2, 0x2

    aget-object v1, v1, v2

    invoke-virtual {v0, p0, v1}, Lgg/j0$c;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lhg/e;

    return-object v0
.end method

.method public bridge synthetic x()Lmg/b;
    .locals 1

    invoke-virtual {p0}, Lgg/q;->K()Lmg/y;

    move-result-object v0

    return-object v0
.end method

.method public z()Z
    .locals 2

    iget-object v0, p0, Lgg/q;->q:Ljava/lang/Object;

    sget-object v1, Lkotlin/jvm/internal/e;->NO_RECEIVER:Ljava/lang/Object;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method
