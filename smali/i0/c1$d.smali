.class public final Li0/c1$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Li0/c1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation


# static fields
.field private static final a:Li0/h1;

.field private static final b:Lj0/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lj0/a<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Li0/f1;

    .line 2
    .line 3
    invoke-direct {v0}, Li0/f1;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Li0/c1$d;->a:Li0/h1;

    .line 7
    .line 8
    new-instance v1, Li0/c1$c;

    .line 9
    .line 10
    invoke-direct {v1, v0}, Li0/c1$c;-><init>(Li0/h1;)V

    .line 11
    .line 12
    .line 13
    const/4 v0, 0x3

    .line 14
    invoke-virtual {v1, v0}, Li0/c1$c;->i(I)Li0/c1$c;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {v0}, Li0/c1$c;->h()Lj0/a;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    sput-object v0, Li0/c1$d;->b:Lj0/a;

    .line 23
    .line 24
    return-void
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
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lj0/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lj0/a<",
            "*>;"
        }
    .end annotation

    sget-object v0, Li0/c1$d;->b:Lj0/a;

    return-object v0
.end method
