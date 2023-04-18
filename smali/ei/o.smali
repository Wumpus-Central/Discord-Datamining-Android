.class public final Lei/o;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lei/o;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lei/o;

    invoke-direct {v0}, Lei/o;-><init>()V

    sput-object v0, Lei/o;->a:Lei/o;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ldi/v1;)Z
    .locals 4

    .line 1
    const-string v0, "type"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Ldi/c;->a:Ldi/c;

    .line 7
    .line 8
    sget-object v1, Lei/q;->a:Lei/q;

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    const/4 v3, 0x1

    .line 12
    invoke-virtual {v1, v2, v3}, Lei/q;->G0(ZZ)Ldi/f1;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-static {p1}, Ldi/d0;->c(Ldi/g0;)Ldi/o0;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    sget-object v2, Ldi/f1$c$b;->a:Ldi/f1$c$b;

    .line 21
    .line 22
    invoke-virtual {v0, v1, p1, v2}, Ldi/c;->a(Ldi/f1;Lhi/k;Ldi/f1$c;)Z

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    return p1
    .line 27
.end method
