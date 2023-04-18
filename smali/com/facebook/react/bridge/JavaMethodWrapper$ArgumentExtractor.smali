.class abstract Lcom/facebook/react/bridge/JavaMethodWrapper$ArgumentExtractor;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/bridge/JavaMethodWrapper;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x40a
    name = "ArgumentExtractor"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/react/bridge/JavaMethodWrapper$1;)V
    .locals 0

    invoke-direct {p0}, Lcom/facebook/react/bridge/JavaMethodWrapper$ArgumentExtractor;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract extractArgument(Lcom/facebook/react/bridge/JSInstance;Lcom/facebook/react/bridge/ReadableArray;I)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/react/bridge/JSInstance;",
            "Lcom/facebook/react/bridge/ReadableArray;",
            "I)TT;"
        }
    .end annotation
.end method

.method public getJSArgumentsNeeded()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
