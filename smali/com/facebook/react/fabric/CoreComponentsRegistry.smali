.class public Lcom/facebook/react/fabric/CoreComponentsRegistry;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Ld6/a;
.end annotation


# instance fields
.field private final mHybridData:Lcom/facebook/jni/HybridData;
    .annotation build Ld6/a;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "fabricjni"

    .line 2
    .line 3
    invoke-static {v0}, Lcom/facebook/soloader/SoLoader;->r(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    return-void
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
.end method

.method private constructor <init>(Lcom/facebook/react/fabric/ComponentFactory;)V
    .locals 0
    .annotation build Ld6/a;
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p1}, Lcom/facebook/react/fabric/CoreComponentsRegistry;->initHybrid(Lcom/facebook/react/fabric/ComponentFactory;)Lcom/facebook/jni/HybridData;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iput-object p1, p0, Lcom/facebook/react/fabric/CoreComponentsRegistry;->mHybridData:Lcom/facebook/jni/HybridData;

    .line 9
    .line 10
    return-void
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
.end method

.method private native initHybrid(Lcom/facebook/react/fabric/ComponentFactory;)Lcom/facebook/jni/HybridData;
    .annotation build Ld6/a;
    .end annotation
.end method

.method public static register(Lcom/facebook/react/fabric/ComponentFactory;)Lcom/facebook/react/fabric/CoreComponentsRegistry;
    .locals 1
    .annotation build Ld6/a;
    .end annotation

    new-instance v0, Lcom/facebook/react/fabric/CoreComponentsRegistry;

    invoke-direct {v0, p0}, Lcom/facebook/react/fabric/CoreComponentsRegistry;-><init>(Lcom/facebook/react/fabric/ComponentFactory;)V

    return-object v0
.end method
