.class Lcom/facebook/react/turbomodule/core/TurboModuleManager$TurboModuleHolder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/turbomodule/core/TurboModuleManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "TurboModuleHolder"
.end annotation


# static fields
.field private static volatile sHolderCount:I


# instance fields
.field private volatile mIsDoneCreatingModule:Z

.field private volatile mIsTryingToCreate:Z

.field private volatile mModule:Lcom/facebook/react/turbomodule/core/interfaces/TurboModule;

.field private volatile mModuleId:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lcom/facebook/react/turbomodule/core/TurboModuleManager$TurboModuleHolder;->mModule:Lcom/facebook/react/turbomodule/core/interfaces/TurboModule;

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    iput-boolean v0, p0, Lcom/facebook/react/turbomodule/core/TurboModuleManager$TurboModuleHolder;->mIsTryingToCreate:Z

    .line 9
    .line 10
    iput-boolean v0, p0, Lcom/facebook/react/turbomodule/core/TurboModuleManager$TurboModuleHolder;->mIsDoneCreatingModule:Z

    .line 11
    .line 12
    sget v0, Lcom/facebook/react/turbomodule/core/TurboModuleManager$TurboModuleHolder;->sHolderCount:I

    .line 13
    .line 14
    iput v0, p0, Lcom/facebook/react/turbomodule/core/TurboModuleManager$TurboModuleHolder;->mModuleId:I

    .line 15
    .line 16
    sget v0, Lcom/facebook/react/turbomodule/core/TurboModuleManager$TurboModuleHolder;->sHolderCount:I

    .line 17
    .line 18
    add-int/lit8 v0, v0, 0x1

    .line 19
    .line 20
    sput v0, Lcom/facebook/react/turbomodule/core/TurboModuleManager$TurboModuleHolder;->sHolderCount:I

    .line 21
    .line 22
    return-void
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


# virtual methods
.method endCreatingModule()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/facebook/react/turbomodule/core/TurboModuleManager$TurboModuleHolder;->mIsTryingToCreate:Z

    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lcom/facebook/react/turbomodule/core/TurboModuleManager$TurboModuleHolder;->mIsDoneCreatingModule:Z

    .line 6
    .line 7
    return-void
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

.method getModule()Lcom/facebook/react/turbomodule/core/interfaces/TurboModule;
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/turbomodule/core/TurboModuleManager$TurboModuleHolder;->mModule:Lcom/facebook/react/turbomodule/core/interfaces/TurboModule;

    return-object v0
.end method

.method getModuleId()I
    .locals 1

    iget v0, p0, Lcom/facebook/react/turbomodule/core/TurboModuleManager$TurboModuleHolder;->mModuleId:I

    return v0
.end method

.method isCreatingModule()Z
    .locals 1

    iget-boolean v0, p0, Lcom/facebook/react/turbomodule/core/TurboModuleManager$TurboModuleHolder;->mIsTryingToCreate:Z

    return v0
.end method

.method isDoneCreatingModule()Z
    .locals 1

    iget-boolean v0, p0, Lcom/facebook/react/turbomodule/core/TurboModuleManager$TurboModuleHolder;->mIsDoneCreatingModule:Z

    return v0
.end method

.method setModule(Lcom/facebook/react/turbomodule/core/interfaces/TurboModule;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/turbomodule/core/TurboModuleManager$TurboModuleHolder;->mModule:Lcom/facebook/react/turbomodule/core/interfaces/TurboModule;

    return-void
.end method

.method startCreatingModule()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/react/turbomodule/core/TurboModuleManager$TurboModuleHolder;->mIsTryingToCreate:Z

    return-void
.end method
