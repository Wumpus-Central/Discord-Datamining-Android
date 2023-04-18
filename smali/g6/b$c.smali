.class Lg6/b$c;
.super Lg6/b$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg6/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "c"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lg6/b$b;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lg6/b$a;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lg6/b$c;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;I)Lg6/b$b;
    .locals 0

    return-object p0
.end method

.method public b(Ljava/lang/String;Ljava/lang/Object;)Lg6/b$b;
    .locals 0

    return-object p0
.end method

.method public c()V
    .locals 0

    return-void
.end method
