.class public Lcom/facebook/react/views/imagehelper/MultiSourceHelper$MultiSourceResult;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/views/imagehelper/MultiSourceHelper;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "MultiSourceResult"
.end annotation


# instance fields
.field private final bestResult:Lcom/facebook/react/views/imagehelper/ImageSource;

.field private final bestResultInCache:Lcom/facebook/react/views/imagehelper/ImageSource;


# direct methods
.method private constructor <init>(Lcom/facebook/react/views/imagehelper/ImageSource;Lcom/facebook/react/views/imagehelper/ImageSource;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/facebook/react/views/imagehelper/MultiSourceHelper$MultiSourceResult;->bestResult:Lcom/facebook/react/views/imagehelper/ImageSource;

    .line 4
    iput-object p2, p0, Lcom/facebook/react/views/imagehelper/MultiSourceHelper$MultiSourceResult;->bestResultInCache:Lcom/facebook/react/views/imagehelper/ImageSource;

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/react/views/imagehelper/ImageSource;Lcom/facebook/react/views/imagehelper/ImageSource;Lcom/facebook/react/views/imagehelper/MultiSourceHelper$1;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/facebook/react/views/imagehelper/MultiSourceHelper$MultiSourceResult;-><init>(Lcom/facebook/react/views/imagehelper/ImageSource;Lcom/facebook/react/views/imagehelper/ImageSource;)V

    return-void
.end method


# virtual methods
.method public getBestResult()Lcom/facebook/react/views/imagehelper/ImageSource;
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/views/imagehelper/MultiSourceHelper$MultiSourceResult;->bestResult:Lcom/facebook/react/views/imagehelper/ImageSource;

    return-object v0
.end method

.method public getBestResultInCache()Lcom/facebook/react/views/imagehelper/ImageSource;
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/views/imagehelper/MultiSourceHelper$MultiSourceResult;->bestResultInCache:Lcom/facebook/react/views/imagehelper/ImageSource;

    return-object v0
.end method
