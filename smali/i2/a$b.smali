.class final Li2/a$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Li2/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "b"
.end annotation


# instance fields
.field private final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Li2/m;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Li2/u;


# direct methods
.method private constructor <init>(Li2/u;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Li2/a$b;->a:Ljava/util/List;

    .line 4
    iput-object p1, p0, Li2/a$b;->b:Li2/u;

    return-void
.end method

.method synthetic constructor <init>(Li2/u;Li2/a$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Li2/a$b;-><init>(Li2/u;)V

    return-void
.end method

.method static synthetic a(Li2/a$b;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Li2/a$b;->a:Ljava/util/List;

    return-object p0
.end method

.method static synthetic b(Li2/a$b;)Li2/u;
    .locals 0

    iget-object p0, p0, Li2/a$b;->b:Li2/u;

    return-object p0
.end method
