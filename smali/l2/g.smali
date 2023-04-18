.class public Ll2/g;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final b:Ll2/g;


# instance fields
.field private final a:Lt0/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lt0/a<",
            "Ljava/lang/String;",
            "Lg2/i;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ll2/g;

    invoke-direct {v0}, Ll2/g;-><init>()V

    sput-object v0, Ll2/g;->b:Ll2/g;

    return-void
.end method

.method constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lt0/a;

    .line 5
    .line 6
    const/16 v1, 0x14

    .line 7
    .line 8
    invoke-direct {v0, v1}, Lt0/a;-><init>(I)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Ll2/g;->a:Lt0/a;

    .line 12
    .line 13
    return-void
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
.end method

.method public static b()Ll2/g;
    .locals 1

    sget-object v0, Ll2/g;->b:Ll2/g;

    return-object v0
.end method


# virtual methods
.method public a(Ljava/lang/String;)Lg2/i;
    .locals 1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    iget-object v0, p0, Ll2/g;->a:Lt0/a;

    invoke-virtual {v0, p1}, Lt0/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lg2/i;

    return-object p1
.end method

.method public c(Ljava/lang/String;Lg2/i;)V
    .locals 1

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Ll2/g;->a:Lt0/a;

    invoke-virtual {v0, p1, p2}, Lt0/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
