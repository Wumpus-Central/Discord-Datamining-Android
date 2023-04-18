.class public final Lei/b$a$a;
.super Ldi/f1$c$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lei/b$a;->k0(Lei/b;Lhi/k;)Ldi/f1$c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lei/b;

.field final synthetic b:Ldi/p1;


# direct methods
.method constructor <init>(Lei/b;Ldi/p1;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lei/b$a$a;->a:Lei/b;

    .line 2
    .line 3
    iput-object p2, p0, Lei/b$a$a;->b:Ldi/p1;

    .line 4
    .line 5
    invoke-direct {p0}, Ldi/f1$c$a;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
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
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
.end method


# virtual methods
.method public a(Ldi/f1;Lhi/i;)Lhi/k;
    .locals 2

    .line 1
    const-string v0, "state"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p1, "type"

    .line 7
    .line 8
    invoke-static {p2, p1}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lei/b$a$a;->a:Lei/b;

    .line 12
    .line 13
    iget-object v0, p0, Lei/b$a$a;->b:Ldi/p1;

    .line 14
    .line 15
    invoke-interface {p1, p2}, Lhi/p;->Q(Lhi/i;)Lhi/k;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    const-string v1, "null cannot be cast to non-null type org.jetbrains.kotlin.types.KotlinType"

    .line 20
    .line 21
    invoke-static {p2, v1}, Lkotlin/jvm/internal/q;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    check-cast p2, Ldi/g0;

    .line 25
    .line 26
    sget-object v1, Ldi/w1;->o:Ldi/w1;

    .line 27
    .line 28
    invoke-virtual {v0, p2, v1}, Ldi/p1;->n(Ldi/g0;Ldi/w1;)Ldi/g0;

    .line 29
    .line 30
    .line 31
    move-result-object p2

    .line 32
    const-string v0, "substitutor.safeSubstitu\u2026VARIANT\n                )"

    .line 33
    .line 34
    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    invoke-interface {p1, p2}, Lei/b;->g(Lhi/i;)Lhi/k;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-static {p1}, Lkotlin/jvm/internal/q;->d(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    return-object p1
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
.end method
