.class public final Lhj/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhj/e;
.implements Lhj/d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lhj/c$f;,
        Lhj/c$e;,
        Lhj/c$d;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lhj/e<",
        "TT;>;",
        "Lhj/d<",
        "TT;>;"
    }
.end annotation


# static fields
.field public static final r:Lhj/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhj/c<",
            "Lnet/time4j/a0;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:Lfj/x;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lfj/x<",
            "TT;>;"
        }
    .end annotation
.end field

.field private final b:Lhj/c$e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhj/c$e<",
            "*>;"
        }
    .end annotation
.end field

.field private final c:Lhj/b;

.field private final d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lhj/i;",
            ">;"
        }
    .end annotation
.end field

.field private final e:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lfj/p<",
            "*>;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private final f:Lhj/j;

.field private final g:Z

.field private final h:Z

.field private final i:Z

.field private final j:I

.field private final k:Lgj/g;

.field private final l:Z

.field private final m:Z

.field private final n:Z

.field private final o:Lfj/x;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lfj/x<",
            "*>;"
        }
    .end annotation
.end field

.field private final p:I

.field private final q:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    invoke-static {}, Lhj/c;->L()Lhj/c;

    move-result-object v0

    sput-object v0, Lhj/c;->r:Lhj/c;

    return-void
.end method

.method private constructor <init>(Lfj/x;Lfj/x;Ljava/util/Locale;Ljava/util/List;Ljava/util/Map;Lgj/a;Lfj/x;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfj/x<",
            "TT;>;",
            "Lfj/x<",
            "*>;",
            "Ljava/util/Locale;",
            "Ljava/util/List<",
            "Lhj/i;",
            ">;",
            "Ljava/util/Map<",
            "Lfj/p<",
            "*>;",
            "Ljava/lang/Object;",
            ">;",
            "Lgj/a;",
            "Lfj/x<",
            "*>;)V"
        }
    .end annotation

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_8

    .line 4
    invoke-interface {p4}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_7

    .line 5
    iput-object p1, p0, Lhj/c;->a:Lfj/x;

    .line 6
    invoke-static {p2}, Lhj/c$e;->h(Lfj/x;)Lhj/c$e;

    move-result-object v0

    iput-object v0, p0, Lhj/c;->b:Lhj/c$e;

    .line 7
    iput-object p7, p0, Lhj/c;->o:Lfj/x;

    if-nez p2, :cond_0

    move-object p7, p1

    goto :goto_0

    :cond_0
    move-object p7, p2

    .line 8
    :goto_0
    invoke-static {p7, p6, p3}, Lhj/b;->d(Lfj/x;Lgj/a;Ljava/util/Locale;)Lhj/b;

    move-result-object p3

    iput-object p3, p0, Lhj/c;->c:Lhj/b;

    .line 9
    sget-object p6, Lgj/a;->f:Lfj/c;

    sget-object p7, Lgj/g;->l:Lgj/g;

    invoke-virtual {p3, p6, p7}, Lhj/b;->a(Lfj/c;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lgj/g;

    iput-object p3, p0, Lhj/c;->k:Lgj/g;

    .line 10
    invoke-static {p5}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p3

    iput-object p3, p0, Lhj/c;->e:Ljava/util/Map;

    .line 11
    invoke-interface {p4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p3

    const/4 p5, 0x1

    const/4 p6, 0x0

    const/4 p7, 0x0

    move v4, p5

    move v0, p6

    move v1, v0

    move v2, v1

    move v3, v2

    :cond_1
    :goto_1
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_6

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lhj/i;

    .line 12
    invoke-virtual {v5}, Lhj/i;->i()Z

    move-result v6

    if-eqz v6, :cond_2

    move v1, p5

    :cond_2
    if-nez p7, :cond_3

    .line 13
    invoke-virtual {v5}, Lhj/i;->d()Lhj/h;

    move-result-object v6

    instance-of v6, v6, Lhj/j;

    if-eqz v6, :cond_3

    .line 14
    const-class p7, Lhj/j;

    invoke-virtual {v5}, Lhj/i;->d()Lhj/h;

    move-result-object v6

    invoke-virtual {p7, v6}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p7

    check-cast p7, Lhj/j;

    :cond_3
    if-nez v0, :cond_4

    .line 15
    invoke-virtual {v5}, Lhj/i;->b()I

    move-result v6

    if-lez v6, :cond_4

    move v0, p5

    .line 16
    :cond_4
    invoke-virtual {v5}, Lhj/i;->d()Lhj/h;

    move-result-object v5

    invoke-interface {v5}, Lhj/h;->c()Lfj/p;

    move-result-object v5

    if-eqz v5, :cond_1

    add-int/lit8 v3, v3, 0x1

    if-eqz v4, :cond_5

    .line 17
    invoke-static {v5}, Lhj/v;->W(Lfj/p;)Z

    move-result v6

    if-nez v6, :cond_5

    move v4, p6

    :cond_5
    if-nez v2, :cond_1

    .line 18
    invoke-static {p1, p2, v5}, Lhj/c;->A(Lfj/x;Lfj/x;Lfj/p;)Z

    move-result v2

    goto :goto_1

    .line 19
    :cond_6
    iput-object p7, p0, Lhj/c;->f:Lhj/j;

    .line 20
    iput-boolean v0, p0, Lhj/c;->g:Z

    .line 21
    iput-boolean v1, p0, Lhj/c;->h:Z

    .line 22
    iput-boolean v2, p0, Lhj/c;->i:Z

    .line 23
    iput v3, p0, Lhj/c;->j:I

    .line 24
    iput-boolean v4, p0, Lhj/c;->l:Z

    .line 25
    iget-object p1, p0, Lhj/c;->c:Lhj/b;

    sget-object p2, Lgj/a;->r:Lfj/c;

    sget-object p3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p1, p2, p3}, Lhj/b;->a(Lfj/c;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iput-boolean p1, p0, Lhj/c;->m:Z

    .line 26
    invoke-direct {p0}, Lhj/c;->x()Z

    move-result p1

    iput-boolean p1, p0, Lhj/c;->n:Z

    .line 27
    invoke-interface {p4}, Ljava/util/List;->size()I

    move-result p1

    iput p1, p0, Lhj/c;->p:I

    .line 28
    invoke-direct {p0, p4}, Lhj/c;->n(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lhj/c;->d:Ljava/util/List;

    .line 29
    invoke-direct {p0}, Lhj/c;->w()Z

    move-result p1

    iput-boolean p1, p0, Lhj/c;->q:Z

    return-void

    .line 30
    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "No format processors defined."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 31
    :cond_8
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "Missing chronology."

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method synthetic constructor <init>(Lfj/x;Lfj/x;Ljava/util/Locale;Ljava/util/List;Ljava/util/Map;Lgj/a;Lfj/x;Lhj/c$a;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p7}, Lhj/c;-><init>(Lfj/x;Lfj/x;Ljava/util/Locale;Ljava/util/List;Ljava/util/Map;Lgj/a;Lfj/x;)V

    return-void
.end method

.method private constructor <init>(Lhj/c;Lgj/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhj/c<",
            "TT;>;",
            "Lgj/a;",
            ")V"
        }
    .end annotation

    .line 32
    iget-object v0, p1, Lhj/c;->c:Lhj/b;

    invoke-virtual {v0, p2}, Lhj/b;->l(Lgj/a;)Lhj/b;

    move-result-object p2

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lhj/c;-><init>(Lhj/c;Lhj/b;Lnet/time4j/history/d;)V

    return-void
.end method

.method private constructor <init>(Lhj/c;Lhj/b;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhj/c<",
            "TT;>;",
            "Lhj/b;",
            ")V"
        }
    .end annotation

    const/4 v0, 0x0

    .line 33
    invoke-direct {p0, p1, p2, v0}, Lhj/c;-><init>(Lhj/c;Lhj/b;Lnet/time4j/history/d;)V

    return-void
.end method

.method synthetic constructor <init>(Lhj/c;Lhj/b;Lhj/c$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2}, Lhj/c;-><init>(Lhj/c;Lhj/b;)V

    return-void
.end method

.method private constructor <init>(Lhj/c;Lhj/b;Lnet/time4j/history/d;)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhj/c<",
            "TT;>;",
            "Lhj/b;",
            "Lnet/time4j/history/d;",
            ")V"
        }
    .end annotation

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p2, :cond_e

    .line 35
    iget-object v0, p1, Lhj/c;->a:Lfj/x;

    iput-object v0, p0, Lhj/c;->a:Lfj/x;

    .line 36
    iget-object v0, p1, Lhj/c;->b:Lhj/c$e;

    iput-object v0, p0, Lhj/c;->b:Lhj/c$e;

    .line 37
    iget-object v0, p1, Lhj/c;->o:Lfj/x;

    iput-object v0, p0, Lhj/c;->o:Lfj/x;

    .line 38
    iput-object p2, p0, Lhj/c;->c:Lhj/b;

    .line 39
    sget-object v0, Lgj/a;->f:Lfj/c;

    sget-object v1, Lgj/g;->l:Lgj/g;

    invoke-virtual {p2, v0, v1}, Lhj/b;->a(Lfj/c;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lgj/g;

    iput-object v0, p0, Lhj/c;->k:Lgj/g;

    .line 40
    new-instance v0, Lhj/q;

    iget-object v1, p1, Lhj/c;->e:Ljava/util/Map;

    invoke-direct {v0, v1}, Lhj/q;-><init>(Ljava/util/Map;)V

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Lhj/c;->e:Ljava/util/Map;

    .line 41
    iget-object v0, p1, Lhj/c;->f:Lhj/j;

    iput-object v0, p0, Lhj/c;->f:Lhj/j;

    .line 42
    iget-boolean v0, p1, Lhj/c;->g:Z

    iput-boolean v0, p0, Lhj/c;->g:Z

    .line 43
    iget-boolean v0, p1, Lhj/c;->h:Z

    iput-boolean v0, p0, Lhj/c;->h:Z

    .line 44
    iget-boolean v0, p1, Lhj/c;->i:Z

    const/4 v1, 0x0

    if-nez v0, :cond_1

    if-eqz p3, :cond_0

    goto :goto_0

    :cond_0
    move v0, v1

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    iput-boolean v0, p0, Lhj/c;->i:Z

    .line 45
    iget v0, p1, Lhj/c;->j:I

    iput v0, p0, Lhj/c;->j:I

    .line 46
    iget-object v0, p1, Lhj/c;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    .line 47
    new-instance v2, Ljava/util/ArrayList;

    iget-object v3, p1, Lhj/c;->d:Ljava/util/List;

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 48
    iget-boolean v3, p1, Lhj/c;->l:Z

    move v4, v1

    :goto_2
    if-ge v4, v0, :cond_d

    .line 49
    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lhj/i;

    .line 50
    invoke-virtual {v5}, Lhj/i;->d()Lhj/h;

    move-result-object v6

    invoke-interface {v6}, Lhj/h;->c()Lfj/p;

    move-result-object v6

    .line 51
    iget-object v7, p0, Lhj/c;->a:Lfj/x;

    .line 52
    invoke-static {}, Lnet/time4j/a0;->W()Lfj/h0;

    move-result-object v8

    if-ne v7, v8, :cond_2

    .line 53
    invoke-virtual {v7}, Lfj/x;->d()Lfj/x;

    move-result-object v7

    :cond_2
    if-eqz v6, :cond_5

    .line 54
    invoke-virtual {v7, v6}, Lfj/x;->x(Lfj/p;)Z

    move-result v8

    if-nez v8, :cond_5

    .line 55
    invoke-virtual {v7}, Lfj/x;->s()Ljava/util/List;

    move-result-object v7

    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_3
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_5

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lfj/s;

    .line 56
    invoke-virtual {p1}, Lhj/c;->u()Ljava/util/Locale;

    move-result-object v9

    iget-object v10, p1, Lhj/c;->c:Lhj/b;

    invoke-interface {v8, v9, v10}, Lfj/s;->a(Ljava/util/Locale;Lfj/d;)Ljava/util/Set;

    move-result-object v9

    invoke-interface {v9, v6}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_3

    .line 57
    invoke-virtual {p2}, Lhj/b;->h()Ljava/util/Locale;

    move-result-object v7

    invoke-interface {v8, v7, p2}, Lfj/s;->a(Ljava/util/Locale;Lfj/d;)Ljava/util/Set;

    move-result-object v7

    .line 58
    invoke-interface {v7}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_4
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_5

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lfj/p;

    .line 59
    invoke-interface {v8}, Lfj/p;->name()Ljava/lang/String;

    move-result-object v9

    invoke-interface {v6}, Lfj/p;->name()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_4

    if-eq v8, v6, :cond_5

    .line 60
    invoke-virtual {v5, v8}, Lhj/i;->x(Lfj/p;)Lhj/i;

    move-result-object v3

    invoke-interface {v2, v4, v3}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    move v3, v1

    :cond_5
    if-eqz p3, :cond_c

    .line 61
    sget-object v3, Lnet/time4j/f0;->z:Lnet/time4j/c;

    if-ne v6, v3, :cond_6

    .line 62
    invoke-virtual {p3}, Lnet/time4j/history/d;->M()Lgj/t;

    move-result-object v3

    goto :goto_4

    .line 63
    :cond_6
    sget-object v3, Lnet/time4j/f0;->C:Lnet/time4j/c0;

    if-eq v6, v3, :cond_a

    sget-object v3, Lnet/time4j/f0;->D:Lnet/time4j/k0;

    if-ne v6, v3, :cond_7

    goto :goto_3

    .line 64
    :cond_7
    sget-object v3, Lnet/time4j/f0;->E:Lnet/time4j/k0;

    if-ne v6, v3, :cond_8

    .line 65
    invoke-virtual {p3}, Lnet/time4j/history/d;->g()Lfj/p;

    move-result-object v3

    goto :goto_4

    .line 66
    :cond_8
    sget-object v3, Lnet/time4j/f0;->G:Lnet/time4j/k0;

    if-ne v6, v3, :cond_9

    .line 67
    invoke-virtual {p3}, Lnet/time4j/history/d;->i()Lfj/p;

    move-result-object v3

    goto :goto_4

    :cond_9
    const/4 v3, 0x0

    goto :goto_4

    .line 68
    :cond_a
    :goto_3
    invoke-virtual {p3}, Lnet/time4j/history/d;->C()Lgj/t;

    move-result-object v3

    :goto_4
    if-eqz v3, :cond_b

    .line 69
    invoke-virtual {v5, v3}, Lhj/i;->x(Lfj/p;)Lhj/i;

    move-result-object v3

    invoke-interface {v2, v4, v3}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    :cond_b
    move v3, v1

    :cond_c
    add-int/lit8 v4, v4, 0x1

    goto/16 :goto_2

    .line 70
    :cond_d
    iput-boolean v3, p0, Lhj/c;->l:Z

    .line 71
    iget-object p1, p0, Lhj/c;->c:Lhj/b;

    sget-object p2, Lgj/a;->r:Lfj/c;

    sget-object p3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p1, p2, p3}, Lhj/b;->a(Lfj/c;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iput-boolean p1, p0, Lhj/c;->m:Z

    .line 72
    invoke-direct {p0}, Lhj/c;->x()Z

    move-result p1

    iput-boolean p1, p0, Lhj/c;->n:Z

    .line 73
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result p1

    iput p1, p0, Lhj/c;->p:I

    .line 74
    invoke-direct {p0, v2}, Lhj/c;->n(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lhj/c;->d:Ljava/util/List;

    .line 75
    invoke-direct {p0}, Lhj/c;->w()Z

    move-result p1

    iput-boolean p1, p0, Lhj/c;->q:Z

    return-void

    .line 76
    :cond_e
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "Missing global format attributes."

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private constructor <init>(Lhj/c;Ljava/util/Map;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhj/c<",
            "TT;>;",
            "Ljava/util/Map<",
            "Lfj/p<",
            "*>;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 77
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 78
    iget-object v0, p1, Lhj/c;->b:Lhj/c$e;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    .line 79
    :cond_0
    invoke-virtual {v0}, Lhj/c$e;->e()Lfj/x;

    move-result-object v0

    .line 80
    :goto_0
    invoke-interface {p2}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lfj/p;

    .line 81
    iget-object v3, p1, Lhj/c;->a:Lfj/x;

    invoke-static {v3, v0, v2}, Lhj/c;->j(Lfj/x;Lfj/x;Lfj/p;)Lfj/x;

    goto :goto_1

    .line 82
    :cond_1
    iget-object v0, p1, Lhj/c;->a:Lfj/x;

    iput-object v0, p0, Lhj/c;->a:Lfj/x;

    .line 83
    iget-object v0, p1, Lhj/c;->b:Lhj/c$e;

    iput-object v0, p0, Lhj/c;->b:Lhj/c$e;

    .line 84
    iget-object v0, p1, Lhj/c;->o:Lfj/x;

    iput-object v0, p0, Lhj/c;->o:Lfj/x;

    .line 85
    iget-object v0, p1, Lhj/c;->c:Lhj/b;

    iput-object v0, p0, Lhj/c;->c:Lhj/b;

    .line 86
    iget-object v0, p1, Lhj/c;->k:Lgj/g;

    iput-object v0, p0, Lhj/c;->k:Lgj/g;

    .line 87
    iget-object v0, p1, Lhj/c;->f:Lhj/j;

    iput-object v0, p0, Lhj/c;->f:Lhj/j;

    .line 88
    iget-boolean v0, p1, Lhj/c;->g:Z

    iput-boolean v0, p0, Lhj/c;->g:Z

    .line 89
    iget-boolean v0, p1, Lhj/c;->h:Z

    iput-boolean v0, p0, Lhj/c;->h:Z

    .line 90
    iget-boolean v0, p1, Lhj/c;->i:Z

    iput-boolean v0, p0, Lhj/c;->i:Z

    .line 91
    iget v0, p1, Lhj/c;->j:I

    iput v0, p0, Lhj/c;->j:I

    .line 92
    iget-boolean v0, p1, Lhj/c;->m:Z

    iput-boolean v0, p0, Lhj/c;->m:Z

    .line 93
    new-instance v0, Ljava/util/HashMap;

    iget-object v1, p1, Lhj/c;->e:Ljava/util/Map;

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    .line 94
    iget-boolean v1, p1, Lhj/c;->l:Z

    .line 95
    invoke-interface {p2}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lfj/p;

    .line 96
    invoke-interface {p2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-nez v4, :cond_2

    .line 97
    invoke-interface {v0, v3}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    .line 98
    :cond_2
    invoke-interface {v0, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz v1, :cond_3

    .line 99
    invoke-static {v3}, Lhj/v;->W(Lfj/p;)Z

    move-result v1

    if-eqz v1, :cond_3

    const/4 v1, 0x1

    goto :goto_2

    :cond_3
    const/4 v1, 0x0

    goto :goto_2

    .line 100
    :cond_4
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p2

    iput-object p2, p0, Lhj/c;->e:Ljava/util/Map;

    .line 101
    iput-boolean v1, p0, Lhj/c;->l:Z

    .line 102
    invoke-direct {p0}, Lhj/c;->x()Z

    move-result p2

    iput-boolean p2, p0, Lhj/c;->n:Z

    .line 103
    iget p2, p1, Lhj/c;->p:I

    iput p2, p0, Lhj/c;->p:I

    .line 104
    iget-object p1, p1, Lhj/c;->d:Ljava/util/List;

    invoke-direct {p0, p1}, Lhj/c;->n(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lhj/c;->d:Ljava/util/List;

    .line 105
    invoke-direct {p0}, Lhj/c;->w()Z

    move-result p1

    iput-boolean p1, p0, Lhj/c;->q:Z

    return-void
.end method

.method private static A(Lfj/x;Lfj/x;Lfj/p;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfj/x<",
            "*>;",
            "Lfj/x<",
            "*>;",
            "Lfj/p<",
            "*>;)Z"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lfj/x;->s()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    const/4 v2, 0x1

    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, Lfj/s;

    .line 21
    .line 22
    invoke-interface {v1, p2}, Lfj/s;->d(Lfj/p;)Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_0

    .line 27
    .line 28
    return v2

    .line 29
    :cond_1
    if-nez p1, :cond_4

    .line 30
    .line 31
    :cond_2
    invoke-virtual {p0}, Lfj/x;->d()Lfj/x;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    if-eqz p0, :cond_8

    .line 36
    .line 37
    invoke-virtual {p0}, Lfj/x;->s()Ljava/util/List;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    :cond_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-eqz v0, :cond_2

    .line 50
    .line 51
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    check-cast v0, Lfj/s;

    .line 56
    .line 57
    invoke-interface {v0, p2}, Lfj/s;->d(Lfj/p;)Z

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    if-eqz v0, :cond_3

    .line 62
    .line 63
    return v2

    .line 64
    :cond_4
    invoke-interface {p2}, Lfj/p;->G()Z

    .line 65
    .line 66
    .line 67
    move-result p0

    .line 68
    if-eqz p0, :cond_6

    .line 69
    .line 70
    invoke-virtual {p1}, Lfj/x;->s()Ljava/util/List;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    :cond_5
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 79
    .line 80
    .line 81
    move-result p1

    .line 82
    if-eqz p1, :cond_8

    .line 83
    .line 84
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    check-cast p1, Lfj/s;

    .line 89
    .line 90
    invoke-interface {p1, p2}, Lfj/s;->d(Lfj/p;)Z

    .line 91
    .line 92
    .line 93
    move-result p1

    .line 94
    if-eqz p1, :cond_5

    .line 95
    .line 96
    return v2

    .line 97
    :cond_6
    invoke-interface {p2}, Lfj/p;->T()Z

    .line 98
    .line 99
    .line 100
    move-result p0

    .line 101
    if-eqz p0, :cond_8

    .line 102
    .line 103
    invoke-static {}, Lnet/time4j/g0;->l0()Lfj/h0;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    invoke-virtual {p0, p2}, Lfj/x;->y(Lfj/p;)Z

    .line 108
    .line 109
    .line 110
    move-result p0

    .line 111
    if-eqz p0, :cond_8

    .line 112
    .line 113
    invoke-static {}, Lnet/time4j/g0;->l0()Lfj/h0;

    .line 114
    .line 115
    .line 116
    move-result-object p0

    .line 117
    invoke-virtual {p0}, Lfj/x;->s()Ljava/util/List;

    .line 118
    .line 119
    .line 120
    move-result-object p0

    .line 121
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 122
    .line 123
    .line 124
    move-result-object p0

    .line 125
    :cond_7
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 126
    .line 127
    .line 128
    move-result p1

    .line 129
    if-eqz p1, :cond_8

    .line 130
    .line 131
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object p1

    .line 135
    check-cast p1, Lfj/s;

    .line 136
    .line 137
    invoke-interface {p1, p2}, Lfj/s;->d(Lfj/p;)Z

    .line 138
    .line 139
    .line 140
    move-result p1

    .line 141
    if-eqz p1, :cond_7

    .line 142
    .line 143
    return v2

    .line 144
    :cond_8
    const/4 p0, 0x0

    .line 145
    return p0
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
.end method

.method public static B(Lgj/e;Lgj/e;Ljava/util/Locale;Lnet/time4j/tz/k;)Lhj/c;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lgj/e;",
            "Lgj/e;",
            "Ljava/util/Locale;",
            "Lnet/time4j/tz/k;",
            ")",
            "Lhj/c<",
            "Lnet/time4j/a0;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Lhj/c$d;

    .line 2
    .line 3
    invoke-static {}, Lnet/time4j/a0;->W()Lfj/h0;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v0, v1, p2, v2}, Lhj/c$d;-><init>(Lfj/x;Ljava/util/Locale;Lhj/c$a;)V

    .line 9
    .line 10
    .line 11
    new-instance p2, Lhj/z;

    .line 12
    .line 13
    invoke-direct {p2, p0, p1}, Lhj/z;-><init>(Lfj/y;Lfj/y;)V

    .line 14
    .line 15
    .line 16
    invoke-static {v0, p2}, Lhj/c$d;->a(Lhj/c$d;Lhj/h;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Lhj/c$d;->F()Lhj/c;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-virtual {p0, p3}, Lhj/c;->V(Lnet/time4j/tz/k;)Lhj/c;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    return-object p0
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
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
.end method

.method public static C(Ljava/lang/String;Lhj/w;Ljava/util/Locale;Lfj/x;)Lhj/c;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "Lhj/w;",
            "Ljava/util/Locale;",
            "Lfj/x<",
            "TT;>;)",
            "Lhj/c<",
            "TT;>;"
        }
    .end annotation

    .line 1
    new-instance v0, Lhj/c$d;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p3, p2, v1}, Lhj/c$d;-><init>(Lfj/x;Ljava/util/Locale;Lhj/c$a;)V

    .line 5
    .line 6
    .line 7
    invoke-static {v0, p0, p1}, Lhj/c;->g(Lhj/c$d;Ljava/lang/String;Lhj/w;)V

    .line 8
    .line 9
    .line 10
    :try_start_0
    invoke-virtual {v0}, Lhj/c$d;->F()Lhj/c;

    .line 11
    .line 12
    .line 13
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 14
    return-object p0

    .line 15
    :catch_0
    move-exception p0

    .line 16
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 17
    .line 18
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/Throwable;)V

    .line 19
    .line 20
    .line 21
    throw p1
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
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
.end method

.method private static D(Lhj/c;Lfj/u;Ljava/util/List;Ljava/lang/CharSequence;Lhj/s;Lfj/d;Lgj/g;ZZ)Ljava/lang/Object;
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lhj/c<",
            "*>;",
            "Lfj/u<",
            "TT;>;",
            "Ljava/util/List<",
            "Lfj/s;",
            ">;",
            "Ljava/lang/CharSequence;",
            "Lhj/s;",
            "Lfj/d;",
            "Lgj/g;",
            "ZZ)TT;"
        }
    .end annotation

    .line 1
    move-object v7, p0

    .line 2
    move-object/from16 v8, p4

    .line 3
    .line 4
    move-object/from16 v9, p5

    .line 5
    .line 6
    move/from16 v10, p7

    .line 7
    .line 8
    invoke-interface/range {p3 .. p3}, Ljava/lang/CharSequence;->length()I

    .line 9
    .line 10
    .line 11
    move-result v11

    .line 12
    invoke-virtual/range {p4 .. p4}, Lhj/s;->f()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-ge v0, v11, :cond_10

    .line 17
    .line 18
    const/4 v12, 0x0

    .line 19
    const/4 v13, 0x0

    .line 20
    :try_start_0
    iget-boolean v0, v7, Lhj/c;->q:Z

    .line 21
    .line 22
    if-eqz v0, :cond_2

    .line 23
    .line 24
    if-nez v10, :cond_2

    .line 25
    .line 26
    new-instance v14, Lhj/u;

    .line 27
    .line 28
    invoke-direct {v14}, Lhj/u;-><init>()V

    .line 29
    .line 30
    .line 31
    iget-object v0, v7, Lhj/c;->d:Ljava/util/List;

    .line 32
    .line 33
    invoke-interface {v0, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    move-object v1, v0

    .line 38
    check-cast v1, Lhj/i;

    .line 39
    .line 40
    move-object/from16 v2, p3

    .line 41
    .line 42
    move-object/from16 v3, p4

    .line 43
    .line 44
    move-object/from16 v4, p5

    .line 45
    .line 46
    move-object v5, v14

    .line 47
    move/from16 v6, p8

    .line 48
    .line 49
    invoke-virtual/range {v1 .. v6}, Lhj/i;->q(Ljava/lang/CharSequence;Lhj/s;Lfj/d;Lhj/t;Z)V

    .line 50
    .line 51
    .line 52
    invoke-virtual/range {p4 .. p4}, Lhj/s;->i()Z

    .line 53
    .line 54
    .line 55
    move-result v0
    :try_end_0
    .catch Lhj/a; {:try_start_0 .. :try_end_0} :catch_2

    .line 56
    if-eqz v0, :cond_0

    .line 57
    .line 58
    return-object v13

    .line 59
    :cond_0
    :try_start_1
    invoke-virtual {v14}, Lhj/u;->G()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v0
    :try_end_1
    .catch Ljava/lang/ClassCastException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Lhj/a; {:try_start_1 .. :try_end_1} :catch_2

    .line 63
    if-eqz v0, :cond_1

    .line 64
    .line 65
    return-object v0

    .line 66
    :catch_0
    :cond_1
    :try_start_2
    invoke-virtual {v8, v14}, Lhj/s;->m(Lfj/q;)V
    :try_end_2
    .catch Lhj/a; {:try_start_2 .. :try_end_2} :catch_1

    .line 67
    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_2
    :try_start_3
    iget v6, v7, Lhj/c;->j:I

    .line 71
    .line 72
    move-object v1, p0

    .line 73
    move-object/from16 v2, p3

    .line 74
    .line 75
    move-object/from16 v3, p4

    .line 76
    .line 77
    move-object/from16 v4, p5

    .line 78
    .line 79
    move/from16 v5, p8

    .line 80
    .line 81
    invoke-direct/range {v1 .. v6}, Lhj/c;->H(Ljava/lang/CharSequence;Lhj/s;Lfj/d;ZI)Lfj/q;

    .line 82
    .line 83
    .line 84
    move-result-object v14
    :try_end_3
    .catch Lhj/a; {:try_start_3 .. :try_end_3} :catch_2

    .line 85
    :try_start_4
    invoke-virtual {v8, v14}, Lhj/s;->m(Lfj/q;)V
    :try_end_4
    .catch Lhj/a; {:try_start_4 .. :try_end_4} :catch_1

    .line 86
    .line 87
    .line 88
    goto :goto_1

    .line 89
    :catch_1
    move-exception v0

    .line 90
    goto :goto_0

    .line 91
    :catch_2
    move-exception v0

    .line 92
    move-object v14, v13

    .line 93
    :goto_0
    invoke-virtual/range {p4 .. p4}, Lhj/s;->i()Z

    .line 94
    .line 95
    .line 96
    move-result v1

    .line 97
    if-nez v1, :cond_3

    .line 98
    .line 99
    invoke-virtual/range {p4 .. p4}, Lhj/s;->f()I

    .line 100
    .line 101
    .line 102
    move-result v1

    .line 103
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    invoke-virtual {v8, v1, v0}, Lhj/s;->k(ILjava/lang/String;)V

    .line 108
    .line 109
    .line 110
    :cond_3
    :goto_1
    if-eqz v14, :cond_f

    .line 111
    .line 112
    invoke-virtual/range {p4 .. p4}, Lhj/s;->i()Z

    .line 113
    .line 114
    .line 115
    move-result v0

    .line 116
    if-eqz v0, :cond_4

    .line 117
    .line 118
    goto/16 :goto_4

    .line 119
    .line 120
    :cond_4
    iget-object v0, v7, Lhj/c;->e:Ljava/util/Map;

    .line 121
    .line 122
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    .line 123
    .line 124
    .line 125
    move-result v0

    .line 126
    if-nez v0, :cond_9

    .line 127
    .line 128
    iget-object v0, v7, Lhj/c;->e:Ljava/util/Map;

    .line 129
    .line 130
    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    move-object v1, v13

    .line 139
    :cond_5
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 140
    .line 141
    .line 142
    move-result v2

    .line 143
    if-eqz v2, :cond_9

    .line 144
    .line 145
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v2

    .line 149
    check-cast v2, Lfj/p;

    .line 150
    .line 151
    invoke-virtual {v14, v2}, Lfj/q;->o(Lfj/p;)Z

    .line 152
    .line 153
    .line 154
    move-result v3

    .line 155
    if-nez v3, :cond_5

    .line 156
    .line 157
    invoke-interface {v2}, Lfj/p;->b()C

    .line 158
    .line 159
    .line 160
    move-result v3

    .line 161
    const/4 v4, 0x1

    .line 162
    if-eqz v3, :cond_8

    .line 163
    .line 164
    if-nez v1, :cond_6

    .line 165
    .line 166
    invoke-virtual {v14}, Lfj/q;->x()Ljava/util/Set;

    .line 167
    .line 168
    .line 169
    move-result-object v1

    .line 170
    :cond_6
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 171
    .line 172
    .line 173
    move-result-object v5

    .line 174
    :cond_7
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 175
    .line 176
    .line 177
    move-result v6

    .line 178
    if-eqz v6, :cond_8

    .line 179
    .line 180
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object v6

    .line 184
    check-cast v6, Lfj/p;

    .line 185
    .line 186
    invoke-interface {v6}, Lfj/p;->b()C

    .line 187
    .line 188
    .line 189
    move-result v6

    .line 190
    if-ne v6, v3, :cond_7

    .line 191
    .line 192
    move v4, v12

    .line 193
    :cond_8
    if-eqz v4, :cond_5

    .line 194
    .line 195
    iget-object v3, v7, Lhj/c;->e:Ljava/util/Map;

    .line 196
    .line 197
    invoke-interface {v3, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object v3

    .line 201
    invoke-static {v14, v2, v3}, Lhj/c;->O(Lfj/q;Lfj/p;Ljava/lang/Object;)V

    .line 202
    .line 203
    .line 204
    goto :goto_2

    .line 205
    :cond_9
    iget-boolean v0, v7, Lhj/c;->i:Z

    .line 206
    .line 207
    if-eqz v0, :cond_a

    .line 208
    .line 209
    :try_start_5
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 210
    .line 211
    .line 212
    move-result-object v0

    .line 213
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 214
    .line 215
    .line 216
    move-result v1

    .line 217
    if-eqz v1, :cond_a

    .line 218
    .line 219
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 220
    .line 221
    .line 222
    move-result-object v1

    .line 223
    check-cast v1, Lfj/s;

    .line 224
    .line 225
    invoke-virtual {p0}, Lhj/c;->u()Ljava/util/Locale;

    .line 226
    .line 227
    .line 228
    move-result-object v2

    .line 229
    invoke-interface {v1, v14, v2, v9}, Lfj/s;->c(Lfj/q;Ljava/util/Locale;Lfj/d;)Lfj/q;

    .line 230
    .line 231
    .line 232
    move-result-object v14
    :try_end_5
    .catch Ljava/lang/RuntimeException; {:try_start_5 .. :try_end_5} :catch_3

    .line 233
    goto :goto_3

    .line 234
    :catch_3
    move-exception v0

    .line 235
    new-instance v1, Ljava/lang/StringBuilder;

    .line 236
    .line 237
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 238
    .line 239
    .line 240
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 241
    .line 242
    .line 243
    move-result-object v0

    .line 244
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 245
    .line 246
    .line 247
    invoke-static {v14}, Lhj/c;->t(Lfj/q;)Ljava/lang/String;

    .line 248
    .line 249
    .line 250
    move-result-object v0

    .line 251
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 252
    .line 253
    .line 254
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 255
    .line 256
    .line 257
    move-result-object v0

    .line 258
    invoke-virtual {v8, v11, v0}, Lhj/s;->k(ILjava/lang/String;)V

    .line 259
    .line 260
    .line 261
    return-object v13

    .line 262
    :cond_a
    :try_start_6
    invoke-virtual/range {p6 .. p6}, Lgj/g;->a()Z

    .line 263
    .line 264
    .line 265
    move-result v0

    .line 266
    move-object/from16 v1, p1

    .line 267
    .line 268
    invoke-interface {v1, v14, v9, v0, v10}, Lfj/u;->c(Lfj/q;Lfj/d;ZZ)Ljava/lang/Object;

    .line 269
    .line 270
    .line 271
    move-result-object v0
    :try_end_6
    .catch Ljava/lang/RuntimeException; {:try_start_6 .. :try_end_6} :catch_4

    .line 272
    iget-object v1, v7, Lhj/c;->f:Lhj/j;

    .line 273
    .line 274
    if-eqz v1, :cond_b

    .line 275
    .line 276
    instance-of v1, v0, Lfj/q;

    .line 277
    .line 278
    if-eqz v1, :cond_b

    .line 279
    .line 280
    const-class v1, Lfj/q;

    .line 281
    .line 282
    invoke-virtual {v1, v0}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    .line 283
    .line 284
    .line 285
    move-result-object v0

    .line 286
    check-cast v0, Lfj/q;

    .line 287
    .line 288
    iget-object v1, v7, Lhj/c;->f:Lhj/j;

    .line 289
    .line 290
    invoke-virtual {v1, v0, v14}, Lhj/j;->g(Lfj/q;Lfj/q;)Lfj/q;

    .line 291
    .line 292
    .line 293
    move-result-object v0

    .line 294
    invoke-static {v0}, Lhj/c;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 295
    .line 296
    .line 297
    move-result-object v0

    .line 298
    :cond_b
    if-nez v0, :cond_d

    .line 299
    .line 300
    if-nez v10, :cond_c

    .line 301
    .line 302
    new-instance v0, Ljava/lang/StringBuilder;

    .line 303
    .line 304
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 305
    .line 306
    .line 307
    invoke-static {v14}, Lhj/c;->v(Lfj/q;)Ljava/lang/String;

    .line 308
    .line 309
    .line 310
    move-result-object v1

    .line 311
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 312
    .line 313
    .line 314
    invoke-static {v14}, Lhj/c;->t(Lfj/q;)Ljava/lang/String;

    .line 315
    .line 316
    .line 317
    move-result-object v1

    .line 318
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 319
    .line 320
    .line 321
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 322
    .line 323
    .line 324
    move-result-object v0

    .line 325
    invoke-virtual {v8, v11, v0}, Lhj/s;->k(ILjava/lang/String;)V

    .line 326
    .line 327
    .line 328
    :cond_c
    return-object v13

    .line 329
    :cond_d
    invoke-virtual/range {p6 .. p6}, Lgj/g;->c()Z

    .line 330
    .line 331
    .line 332
    move-result v1

    .line 333
    if-eqz v1, :cond_e

    .line 334
    .line 335
    move-object/from16 v1, p3

    .line 336
    .line 337
    invoke-static {v14, v0, v1, v8}, Lhj/c;->i(Lfj/q;Ljava/lang/Object;Ljava/lang/CharSequence;Lhj/s;)Ljava/lang/Object;

    .line 338
    .line 339
    .line 340
    move-result-object v0

    .line 341
    :cond_e
    return-object v0

    .line 342
    :catch_4
    move-exception v0

    .line 343
    new-instance v1, Ljava/lang/StringBuilder;

    .line 344
    .line 345
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 346
    .line 347
    .line 348
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 349
    .line 350
    .line 351
    move-result-object v0

    .line 352
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 353
    .line 354
    .line 355
    invoke-static {v14}, Lhj/c;->t(Lfj/q;)Ljava/lang/String;

    .line 356
    .line 357
    .line 358
    move-result-object v0

    .line 359
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 360
    .line 361
    .line 362
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 363
    .line 364
    .line 365
    move-result-object v0

    .line 366
    invoke-virtual {v8, v11, v0}, Lhj/s;->k(ILjava/lang/String;)V

    .line 367
    .line 368
    .line 369
    :cond_f
    :goto_4
    return-object v13

    .line 370
    :cond_10
    move-object/from16 v1, p3

    .line 371
    .line 372
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    .line 373
    .line 374
    new-instance v2, Ljava/lang/StringBuilder;

    .line 375
    .line 376
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 377
    .line 378
    .line 379
    const-string v3, "["

    .line 380
    .line 381
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 382
    .line 383
    .line 384
    invoke-virtual/range {p4 .. p4}, Lhj/s;->f()I

    .line 385
    .line 386
    .line 387
    move-result v3

    .line 388
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 389
    .line 390
    .line 391
    const-string v3, "]: "

    .line 392
    .line 393
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 394
    .line 395
    .line 396
    invoke-interface/range {p3 .. p3}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 397
    .line 398
    .line 399
    move-result-object v1

    .line 400
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 401
    .line 402
    .line 403
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 404
    .line 405
    .line 406
    move-result-object v1

    .line 407
    invoke-direct {v0, v1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 408
    .line 409
    .line 410
    throw v0
.end method

.method private static E(Lhj/c;Lfj/x;ILjava/lang/CharSequence;Lhj/s;Lfj/d;Lgj/g;Z)Ljava/lang/Object;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<C:",
            "Ljava/lang/Object;",
            ">(",
            "Lhj/c<",
            "*>;",
            "Lfj/x<",
            "TC;>;I",
            "Ljava/lang/CharSequence;",
            "Lhj/s;",
            "Lfj/d;",
            "Lgj/g;",
            "Z)TC;"
        }
    .end annotation

    .line 1
    move-object v0, p1

    .line 2
    move-object/from16 v10, p4

    .line 3
    .line 4
    invoke-virtual {p1}, Lfj/x;->d()Lfj/x;

    .line 5
    .line 6
    .line 7
    move-result-object v11

    .line 8
    const/4 v1, 0x1

    .line 9
    const/4 v12, 0x0

    .line 10
    move-object v2, p0

    .line 11
    if-eqz v11, :cond_8

    .line 12
    .line 13
    iget-object v3, v2, Lhj/c;->o:Lfj/x;

    .line 14
    .line 15
    if-ne v0, v3, :cond_0

    .line 16
    .line 17
    goto/16 :goto_2

    .line 18
    .line 19
    :cond_0
    if-ne v11, v3, :cond_1

    .line 20
    .line 21
    invoke-virtual {v11}, Lfj/x;->s()Ljava/util/List;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    const/4 v8, 0x1

    .line 26
    move-object v1, p0

    .line 27
    move-object v2, v11

    .line 28
    move-object/from16 v4, p3

    .line 29
    .line 30
    move-object/from16 v5, p4

    .line 31
    .line 32
    move-object/from16 v6, p5

    .line 33
    .line 34
    move-object/from16 v7, p6

    .line 35
    .line 36
    move/from16 v9, p7

    .line 37
    .line 38
    invoke-static/range {v1 .. v9}, Lhj/c;->D(Lhj/c;Lfj/u;Ljava/util/List;Ljava/lang/CharSequence;Lhj/s;Lfj/d;Lgj/g;ZZ)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    goto :goto_0

    .line 43
    :cond_1
    add-int/lit8 v3, p2, 0x1

    .line 44
    .line 45
    move-object v1, p0

    .line 46
    move-object v2, v11

    .line 47
    move-object/from16 v4, p3

    .line 48
    .line 49
    move-object/from16 v5, p4

    .line 50
    .line 51
    move-object/from16 v6, p5

    .line 52
    .line 53
    move-object/from16 v7, p6

    .line 54
    .line 55
    move/from16 v8, p7

    .line 56
    .line 57
    invoke-static/range {v1 .. v8}, Lhj/c;->E(Lhj/c;Lfj/x;ILjava/lang/CharSequence;Lhj/s;Lfj/d;Lgj/g;Z)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    :goto_0
    invoke-virtual/range {p4 .. p4}, Lhj/s;->i()Z

    .line 62
    .line 63
    .line 64
    move-result v2

    .line 65
    const/4 v3, 0x0

    .line 66
    if-eqz v2, :cond_2

    .line 67
    .line 68
    return-object v3

    .line 69
    :cond_2
    if-nez v1, :cond_3

    .line 70
    .line 71
    invoke-virtual/range {p4 .. p4}, Lhj/s;->g()Lfj/q;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    invoke-interface/range {p3 .. p3}, Ljava/lang/CharSequence;->length()I

    .line 76
    .line 77
    .line 78
    move-result v1

    .line 79
    new-instance v2, Ljava/lang/StringBuilder;

    .line 80
    .line 81
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 82
    .line 83
    .line 84
    invoke-static {v0}, Lhj/c;->v(Lfj/q;)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v4

    .line 88
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    invoke-static {v0}, Lhj/c;->t(Lfj/q;)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    invoke-virtual {v10, v1, v0}, Lhj/s;->k(ILjava/lang/String;)V

    .line 103
    .line 104
    .line 105
    return-object v3

    .line 106
    :cond_3
    invoke-virtual/range {p4 .. p4}, Lhj/s;->h()Lfj/q;

    .line 107
    .line 108
    .line 109
    move-result-object v2

    .line 110
    :try_start_0
    instance-of v4, v11, Lfj/h0;

    .line 111
    .line 112
    if-eqz v4, :cond_7

    .line 113
    .line 114
    const-class v4, Lfj/h0;

    .line 115
    .line 116
    invoke-virtual {v4, v11}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v4

    .line 120
    check-cast v4, Lfj/h0;

    .line 121
    .line 122
    invoke-virtual {v4}, Lfj/h0;->J()Lfj/p;

    .line 123
    .line 124
    .line 125
    move-result-object v4

    .line 126
    invoke-static {v2, v4, v1}, Lhj/c;->Q(Lfj/q;Lfj/p;Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    invoke-virtual/range {p6 .. p6}, Lgj/g;->a()Z

    .line 130
    .line 131
    .line 132
    move-result v1

    .line 133
    move-object/from16 v6, p5

    .line 134
    .line 135
    invoke-virtual {p1, v2, v6, v1, v12}, Lfj/x;->c(Lfj/q;Lfj/d;ZZ)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1

    .line 139
    if-nez v0, :cond_5

    .line 140
    .line 141
    invoke-virtual/range {p4 .. p4}, Lhj/s;->i()Z

    .line 142
    .line 143
    .line 144
    move-result v0

    .line 145
    if-nez v0, :cond_4

    .line 146
    .line 147
    invoke-interface/range {p3 .. p3}, Ljava/lang/CharSequence;->length()I

    .line 148
    .line 149
    .line 150
    move-result v0

    .line 151
    new-instance v1, Ljava/lang/StringBuilder;

    .line 152
    .line 153
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 154
    .line 155
    .line 156
    invoke-static {v2}, Lhj/c;->v(Lfj/q;)Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object v4

    .line 160
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 161
    .line 162
    .line 163
    invoke-static {v2}, Lhj/c;->t(Lfj/q;)Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v2

    .line 167
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 168
    .line 169
    .line 170
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object v1

    .line 174
    invoke-virtual {v10, v0, v1}, Lhj/s;->k(ILjava/lang/String;)V

    .line 175
    .line 176
    .line 177
    :cond_4
    return-object v3

    .line 178
    :cond_5
    invoke-virtual/range {p6 .. p6}, Lgj/g;->c()Z

    .line 179
    .line 180
    .line 181
    move-result v1

    .line 182
    if-eqz v1, :cond_6

    .line 183
    .line 184
    move-object/from16 v4, p3

    .line 185
    .line 186
    invoke-static {v2, v0, v4, v10}, Lhj/c;->i(Lfj/q;Ljava/lang/Object;Ljava/lang/CharSequence;Lhj/s;)Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    :cond_6
    return-object v0

    .line 191
    :cond_7
    move-object/from16 v4, p3

    .line 192
    .line 193
    :try_start_1
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 194
    .line 195
    new-instance v5, Ljava/lang/StringBuilder;

    .line 196
    .line 197
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 198
    .line 199
    .line 200
    const-string v6, "Unsupported chronology or preparser: "

    .line 201
    .line 202
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 203
    .line 204
    .line 205
    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 206
    .line 207
    .line 208
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object v0

    .line 212
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 213
    .line 214
    .line 215
    throw v1
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0

    .line 216
    :catch_0
    move-exception v0

    .line 217
    goto :goto_1

    .line 218
    :catch_1
    move-exception v0

    .line 219
    move-object/from16 v4, p3

    .line 220
    .line 221
    :goto_1
    invoke-interface/range {p3 .. p3}, Ljava/lang/CharSequence;->length()I

    .line 222
    .line 223
    .line 224
    move-result v1

    .line 225
    new-instance v4, Ljava/lang/StringBuilder;

    .line 226
    .line 227
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 228
    .line 229
    .line 230
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 231
    .line 232
    .line 233
    move-result-object v0

    .line 234
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 235
    .line 236
    .line 237
    invoke-static {v2}, Lhj/c;->t(Lfj/q;)Ljava/lang/String;

    .line 238
    .line 239
    .line 240
    move-result-object v0

    .line 241
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 242
    .line 243
    .line 244
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 245
    .line 246
    .line 247
    move-result-object v0

    .line 248
    invoke-virtual {v10, v1, v0}, Lhj/s;->k(ILjava/lang/String;)V

    .line 249
    .line 250
    .line 251
    return-object v3

    .line 252
    :cond_8
    :goto_2
    move-object/from16 v4, p3

    .line 253
    .line 254
    move-object/from16 v6, p5

    .line 255
    .line 256
    invoke-virtual {p1}, Lfj/x;->s()Ljava/util/List;

    .line 257
    .line 258
    .line 259
    move-result-object v3

    .line 260
    if-lez p2, :cond_9

    .line 261
    .line 262
    move v8, v1

    .line 263
    goto :goto_3

    .line 264
    :cond_9
    move v8, v12

    .line 265
    :goto_3
    move-object v1, p0

    .line 266
    move-object v2, p1

    .line 267
    move-object/from16 v4, p3

    .line 268
    .line 269
    move-object/from16 v5, p4

    .line 270
    .line 271
    move-object/from16 v6, p5

    .line 272
    .line 273
    move-object/from16 v7, p6

    .line 274
    .line 275
    move/from16 v9, p7

    .line 276
    .line 277
    invoke-static/range {v1 .. v9}, Lhj/c;->D(Lhj/c;Lfj/u;Ljava/util/List;Ljava/lang/CharSequence;Lhj/s;Lfj/d;Lgj/g;ZZ)Ljava/lang/Object;

    .line 278
    .line 279
    .line 280
    move-result-object v0

    .line 281
    return-object v0
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
.end method

.method private H(Ljava/lang/CharSequence;Lhj/s;Lfj/d;ZI)Lfj/q;
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/CharSequence;",
            "Lhj/s;",
            "Lfj/d;",
            "ZI)",
            "Lfj/q<",
            "*>;"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v7, p2

    .line 4
    .line 5
    move/from16 v8, p5

    .line 6
    .line 7
    new-instance v1, Lhj/v;

    .line 8
    .line 9
    iget-boolean v2, v0, Lhj/c;->l:Z

    .line 10
    .line 11
    invoke-direct {v1, v8, v2}, Lhj/v;-><init>(IZ)V

    .line 12
    .line 13
    .line 14
    invoke-virtual/range {p2 .. p2}, Lhj/s;->f()I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    invoke-virtual {v1, v2}, Lhj/v;->g0(I)V

    .line 19
    .line 20
    .line 21
    iget-boolean v2, v0, Lhj/c;->g:Z

    .line 22
    .line 23
    const/4 v9, 0x0

    .line 24
    if-eqz v2, :cond_0

    .line 25
    .line 26
    new-instance v2, Ljava/util/LinkedList;

    .line 27
    .line 28
    invoke-direct {v2}, Ljava/util/LinkedList;-><init>()V

    .line 29
    .line 30
    .line 31
    invoke-interface {v2, v1}, Ljava/util/Deque;->push(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    move-object v10, v2

    .line 35
    goto :goto_0

    .line 36
    :cond_0
    move-object v10, v9

    .line 37
    :goto_0
    iget-object v2, v0, Lhj/c;->d:Ljava/util/List;

    .line 38
    .line 39
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 40
    .line 41
    .line 42
    move-result v11

    .line 43
    const/4 v2, 0x0

    .line 44
    move v3, v2

    .line 45
    move v12, v3

    .line 46
    :goto_1
    if-ge v12, v11, :cond_12

    .line 47
    .line 48
    iget-object v4, v0, Lhj/c;->d:Ljava/util/List;

    .line 49
    .line 50
    invoke-interface {v4, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v4

    .line 54
    move-object v13, v4

    .line 55
    check-cast v13, Lhj/i;

    .line 56
    .line 57
    if-nez v10, :cond_1

    .line 58
    .line 59
    move-object v14, v1

    .line 60
    move-object v15, v14

    .line 61
    move/from16 v16, v2

    .line 62
    .line 63
    goto :goto_4

    .line 64
    :cond_1
    invoke-virtual {v13}, Lhj/i;->b()I

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    move v4, v2

    .line 69
    :goto_2
    if-le v4, v3, :cond_2

    .line 70
    .line 71
    new-instance v1, Lhj/v;

    .line 72
    .line 73
    ushr-int/lit8 v5, v8, 0x1

    .line 74
    .line 75
    iget-boolean v6, v0, Lhj/c;->l:Z

    .line 76
    .line 77
    invoke-direct {v1, v5, v6}, Lhj/v;-><init>(IZ)V

    .line 78
    .line 79
    .line 80
    invoke-virtual/range {p2 .. p2}, Lhj/s;->f()I

    .line 81
    .line 82
    .line 83
    move-result v5

    .line 84
    invoke-virtual {v1, v5}, Lhj/v;->g0(I)V

    .line 85
    .line 86
    .line 87
    invoke-interface {v10, v1}, Ljava/util/Deque;->push(Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    add-int/lit8 v4, v4, -0x1

    .line 91
    .line 92
    goto :goto_2

    .line 93
    :cond_2
    :goto_3
    if-ge v4, v3, :cond_3

    .line 94
    .line 95
    invoke-interface {v10}, Ljava/util/Deque;->pop()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    check-cast v1, Lhj/v;

    .line 100
    .line 101
    invoke-interface {v10}, Ljava/util/Deque;->peek()Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v5

    .line 105
    check-cast v5, Lhj/v;

    .line 106
    .line 107
    invoke-virtual {v5, v1}, Lhj/v;->a0(Lhj/v;)V

    .line 108
    .line 109
    .line 110
    add-int/lit8 v4, v4, 0x1

    .line 111
    .line 112
    goto :goto_3

    .line 113
    :cond_3
    invoke-interface {v10}, Ljava/util/Deque;->peek()Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v3

    .line 117
    check-cast v3, Lhj/v;

    .line 118
    .line 119
    move-object v15, v1

    .line 120
    move/from16 v16, v2

    .line 121
    .line 122
    move-object v14, v3

    .line 123
    :goto_4
    invoke-virtual/range {p2 .. p2}, Lhj/s;->b()V

    .line 124
    .line 125
    .line 126
    move-object v1, v13

    .line 127
    move-object/from16 v2, p1

    .line 128
    .line 129
    move-object/from16 v3, p2

    .line 130
    .line 131
    move-object/from16 v4, p3

    .line 132
    .line 133
    move-object v5, v14

    .line 134
    move/from16 v6, p4

    .line 135
    .line 136
    invoke-virtual/range {v1 .. v6}, Lhj/i;->q(Ljava/lang/CharSequence;Lhj/s;Lfj/d;Lhj/t;Z)V

    .line 137
    .line 138
    .line 139
    invoke-virtual/range {p2 .. p2}, Lhj/s;->j()Z

    .line 140
    .line 141
    .line 142
    move-result v1

    .line 143
    if-eqz v1, :cond_4

    .line 144
    .line 145
    invoke-virtual {v13}, Lhj/i;->d()Lhj/h;

    .line 146
    .line 147
    .line 148
    move-result-object v1

    .line 149
    invoke-interface {v1}, Lhj/h;->c()Lfj/p;

    .line 150
    .line 151
    .line 152
    move-result-object v1

    .line 153
    if-eqz v1, :cond_4

    .line 154
    .line 155
    iget-object v2, v0, Lhj/c;->e:Ljava/util/Map;

    .line 156
    .line 157
    invoke-interface {v2, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 158
    .line 159
    .line 160
    move-result v2

    .line 161
    if-eqz v2, :cond_4

    .line 162
    .line 163
    iget-object v2, v0, Lhj/c;->e:Ljava/util/Map;

    .line 164
    .line 165
    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object v2

    .line 169
    invoke-virtual {v14, v1, v2}, Lhj/v;->I(Lfj/p;Ljava/lang/Object;)V

    .line 170
    .line 171
    .line 172
    sget-object v1, Lfj/n0;->k:Lfj/n0;

    .line 173
    .line 174
    invoke-virtual {v14, v1, v9}, Lhj/t;->N(Lfj/p;Ljava/lang/Object;)Lhj/t;

    .line 175
    .line 176
    .line 177
    invoke-virtual/range {p2 .. p2}, Lhj/s;->a()V

    .line 178
    .line 179
    .line 180
    invoke-virtual/range {p2 .. p2}, Lhj/s;->b()V

    .line 181
    .line 182
    .line 183
    :cond_4
    invoke-virtual/range {p2 .. p2}, Lhj/s;->i()Z

    .line 184
    .line 185
    .line 186
    move-result v1

    .line 187
    if-eqz v1, :cond_10

    .line 188
    .line 189
    invoke-virtual {v13}, Lhj/i;->f()I

    .line 190
    .line 191
    .line 192
    move-result v1

    .line 193
    invoke-virtual {v13}, Lhj/i;->i()Z

    .line 194
    .line 195
    .line 196
    move-result v2

    .line 197
    if-nez v2, :cond_6

    .line 198
    .line 199
    add-int/lit8 v2, v12, 0x1

    .line 200
    .line 201
    :goto_5
    if-ge v2, v11, :cond_6

    .line 202
    .line 203
    iget-object v3, v0, Lhj/c;->d:Ljava/util/List;

    .line 204
    .line 205
    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object v3

    .line 209
    check-cast v3, Lhj/i;

    .line 210
    .line 211
    invoke-virtual {v3}, Lhj/i;->i()Z

    .line 212
    .line 213
    .line 214
    move-result v4

    .line 215
    if-eqz v4, :cond_5

    .line 216
    .line 217
    invoke-virtual {v3}, Lhj/i;->f()I

    .line 218
    .line 219
    .line 220
    move-result v3

    .line 221
    if-ne v3, v1, :cond_5

    .line 222
    .line 223
    goto :goto_6

    .line 224
    :cond_5
    add-int/lit8 v2, v2, 0x1

    .line 225
    .line 226
    goto :goto_5

    .line 227
    :cond_6
    move v2, v12

    .line 228
    :goto_6
    if-gt v2, v12, :cond_d

    .line 229
    .line 230
    invoke-virtual {v13}, Lhj/i;->i()Z

    .line 231
    .line 232
    .line 233
    move-result v3

    .line 234
    if-eqz v3, :cond_7

    .line 235
    .line 236
    goto :goto_a

    .line 237
    :cond_7
    if-nez v16, :cond_9

    .line 238
    .line 239
    if-eqz v10, :cond_8

    .line 240
    .line 241
    invoke-interface {v10}, Ljava/util/Deque;->peek()Ljava/lang/Object;

    .line 242
    .line 243
    .line 244
    move-result-object v1

    .line 245
    move-object v15, v1

    .line 246
    check-cast v15, Lhj/v;

    .line 247
    .line 248
    :cond_8
    invoke-virtual {v15}, Lhj/v;->f0()V

    .line 249
    .line 250
    .line 251
    return-object v15

    .line 252
    :cond_9
    invoke-virtual {v13}, Lhj/i;->b()I

    .line 253
    .line 254
    .line 255
    move-result v3

    .line 256
    add-int/lit8 v12, v12, 0x1

    .line 257
    .line 258
    move v4, v2

    .line 259
    move v2, v12

    .line 260
    :goto_7
    if-ge v2, v11, :cond_a

    .line 261
    .line 262
    iget-object v5, v0, Lhj/c;->d:Ljava/util/List;

    .line 263
    .line 264
    invoke-interface {v5, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 265
    .line 266
    .line 267
    move-result-object v5

    .line 268
    check-cast v5, Lhj/i;

    .line 269
    .line 270
    invoke-virtual {v5}, Lhj/i;->b()I

    .line 271
    .line 272
    .line 273
    move-result v5

    .line 274
    if-le v5, v3, :cond_a

    .line 275
    .line 276
    add-int/lit8 v4, v2, 0x1

    .line 277
    .line 278
    move/from16 v17, v4

    .line 279
    .line 280
    move v4, v2

    .line 281
    move/from16 v2, v17

    .line 282
    .line 283
    goto :goto_7

    .line 284
    :cond_a
    add-int/lit8 v2, v11, -0x1

    .line 285
    .line 286
    :goto_8
    if-le v2, v4, :cond_c

    .line 287
    .line 288
    iget-object v3, v0, Lhj/c;->d:Ljava/util/List;

    .line 289
    .line 290
    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 291
    .line 292
    .line 293
    move-result-object v3

    .line 294
    check-cast v3, Lhj/i;

    .line 295
    .line 296
    invoke-virtual {v3}, Lhj/i;->f()I

    .line 297
    .line 298
    .line 299
    move-result v3

    .line 300
    if-ne v3, v1, :cond_b

    .line 301
    .line 302
    move v4, v2

    .line 303
    goto :goto_9

    .line 304
    :cond_b
    add-int/lit8 v2, v2, -0x1

    .line 305
    .line 306
    goto :goto_8

    .line 307
    :cond_c
    :goto_9
    add-int/lit8 v16, v16, -0x1

    .line 308
    .line 309
    invoke-interface {v10}, Ljava/util/Deque;->pop()Ljava/lang/Object;

    .line 310
    .line 311
    .line 312
    move-result-object v1

    .line 313
    check-cast v1, Lhj/v;

    .line 314
    .line 315
    invoke-virtual/range {p2 .. p2}, Lhj/s;->a()V

    .line 316
    .line 317
    .line 318
    invoke-virtual {v1}, Lhj/v;->V()I

    .line 319
    .line 320
    .line 321
    move-result v2

    .line 322
    invoke-virtual {v7, v2}, Lhj/s;->l(I)V

    .line 323
    .line 324
    .line 325
    move v12, v4

    .line 326
    goto :goto_c

    .line 327
    :cond_d
    :goto_a
    if-eqz v10, :cond_e

    .line 328
    .line 329
    invoke-interface {v10}, Ljava/util/Deque;->pop()Ljava/lang/Object;

    .line 330
    .line 331
    .line 332
    move-result-object v1

    .line 333
    move-object v15, v1

    .line 334
    check-cast v15, Lhj/v;

    .line 335
    .line 336
    :cond_e
    invoke-virtual/range {p2 .. p2}, Lhj/s;->a()V

    .line 337
    .line 338
    .line 339
    invoke-virtual {v15}, Lhj/v;->V()I

    .line 340
    .line 341
    .line 342
    move-result v1

    .line 343
    invoke-virtual {v7, v1}, Lhj/s;->l(I)V

    .line 344
    .line 345
    .line 346
    invoke-virtual {v15}, Lhj/v;->e0()V

    .line 347
    .line 348
    .line 349
    if-eqz v10, :cond_f

    .line 350
    .line 351
    invoke-interface {v10, v15}, Ljava/util/Deque;->push(Ljava/lang/Object;)V

    .line 352
    .line 353
    .line 354
    :cond_f
    move v12, v2

    .line 355
    goto :goto_b

    .line 356
    :cond_10
    invoke-virtual {v13}, Lhj/i;->i()Z

    .line 357
    .line 358
    .line 359
    move-result v1

    .line 360
    if-eqz v1, :cond_11

    .line 361
    .line 362
    invoke-virtual {v13}, Lhj/i;->u()I

    .line 363
    .line 364
    .line 365
    move-result v12

    .line 366
    :cond_11
    :goto_b
    move-object v1, v15

    .line 367
    :goto_c
    move/from16 v3, v16

    .line 368
    .line 369
    add-int/lit8 v12, v12, 0x1

    .line 370
    .line 371
    move v2, v3

    .line 372
    goto/16 :goto_1

    .line 373
    .line 374
    :cond_12
    :goto_d
    if-lez v2, :cond_13

    .line 375
    .line 376
    invoke-interface {v10}, Ljava/util/Deque;->pop()Ljava/lang/Object;

    .line 377
    .line 378
    .line 379
    move-result-object v1

    .line 380
    check-cast v1, Lhj/v;

    .line 381
    .line 382
    invoke-interface {v10}, Ljava/util/Deque;->peek()Ljava/lang/Object;

    .line 383
    .line 384
    .line 385
    move-result-object v3

    .line 386
    check-cast v3, Lhj/v;

    .line 387
    .line 388
    invoke-virtual {v3, v1}, Lhj/v;->a0(Lhj/v;)V

    .line 389
    .line 390
    .line 391
    add-int/lit8 v2, v2, -0x1

    .line 392
    .line 393
    goto :goto_d

    .line 394
    :cond_13
    if-eqz v10, :cond_14

    .line 395
    .line 396
    invoke-interface {v10}, Ljava/util/Deque;->peek()Ljava/lang/Object;

    .line 397
    .line 398
    .line 399
    move-result-object v1

    .line 400
    check-cast v1, Lhj/v;

    .line 401
    .line 402
    :cond_14
    invoke-virtual {v1}, Lhj/v;->f0()V

    .line 403
    .line 404
    .line 405
    return-object v1
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
.end method

.method private static L()Lhj/c;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lhj/c<",
            "Lnet/time4j/a0;",
            ">;"
        }
    .end annotation

    .line 1
    const-class v0, Lnet/time4j/a0;

    .line 2
    .line 3
    sget-object v1, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 4
    .line 5
    invoke-static {v0, v1}, Lhj/c;->N(Ljava/lang/Class;Ljava/util/Locale;)Lhj/c$d;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0}, Lhj/c;->M(Lhj/c$d;)V

    .line 10
    .line 11
    .line 12
    sget-object v1, Lgj/e;->n:Lgj/e;

    .line 13
    .line 14
    const-string v2, "UT"

    .line 15
    .line 16
    const-string v3, "Z"

    .line 17
    .line 18
    const-string v4, "GMT"

    .line 19
    .line 20
    filled-new-array {v4, v2, v3}, [Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-static {v2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    const/4 v3, 0x0

    .line 29
    invoke-virtual {v0, v1, v3, v2}, Lhj/c$d;->C(Lgj/e;ZLjava/util/List;)Lhj/c$d;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0}, Lhj/c$d;->U()Lhj/c$d;

    .line 33
    .line 34
    .line 35
    invoke-static {v0}, Lhj/c;->M(Lhj/c$d;)V

    .line 36
    .line 37
    .line 38
    new-instance v1, Ljava/util/HashMap;

    .line 39
    .line 40
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 41
    .line 42
    .line 43
    sget-object v2, Lnet/time4j/tz/f;->k:Lnet/time4j/tz/f;

    .line 44
    .line 45
    const/4 v3, 0x5

    .line 46
    invoke-static {v2, v3}, Lnet/time4j/tz/p;->p(Lnet/time4j/tz/f;I)Lnet/time4j/tz/p;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    const-string v5, "EST"

    .line 51
    .line 52
    invoke-interface {v1, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    const/4 v4, 0x4

    .line 56
    invoke-static {v2, v4}, Lnet/time4j/tz/p;->p(Lnet/time4j/tz/f;I)Lnet/time4j/tz/p;

    .line 57
    .line 58
    .line 59
    move-result-object v4

    .line 60
    const-string v5, "EDT"

    .line 61
    .line 62
    invoke-interface {v1, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    const/4 v4, 0x6

    .line 66
    invoke-static {v2, v4}, Lnet/time4j/tz/p;->p(Lnet/time4j/tz/f;I)Lnet/time4j/tz/p;

    .line 67
    .line 68
    .line 69
    move-result-object v5

    .line 70
    const-string v6, "CST"

    .line 71
    .line 72
    invoke-interface {v1, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    const-string v5, "CDT"

    .line 76
    .line 77
    invoke-static {v2, v3}, Lnet/time4j/tz/p;->p(Lnet/time4j/tz/f;I)Lnet/time4j/tz/p;

    .line 78
    .line 79
    .line 80
    move-result-object v3

    .line 81
    invoke-interface {v1, v5, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    const/4 v3, 0x7

    .line 85
    invoke-static {v2, v3}, Lnet/time4j/tz/p;->p(Lnet/time4j/tz/f;I)Lnet/time4j/tz/p;

    .line 86
    .line 87
    .line 88
    move-result-object v5

    .line 89
    const-string v6, "MST"

    .line 90
    .line 91
    invoke-interface {v1, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    const-string v5, "MDT"

    .line 95
    .line 96
    invoke-static {v2, v4}, Lnet/time4j/tz/p;->p(Lnet/time4j/tz/f;I)Lnet/time4j/tz/p;

    .line 97
    .line 98
    .line 99
    move-result-object v4

    .line 100
    invoke-interface {v1, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    const/16 v4, 0x8

    .line 104
    .line 105
    invoke-static {v2, v4}, Lnet/time4j/tz/p;->p(Lnet/time4j/tz/f;I)Lnet/time4j/tz/p;

    .line 106
    .line 107
    .line 108
    move-result-object v4

    .line 109
    const-string v5, "PST"

    .line 110
    .line 111
    invoke-interface {v1, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    const-string v4, "PDT"

    .line 115
    .line 116
    invoke-static {v2, v3}, Lnet/time4j/tz/p;->p(Lnet/time4j/tz/f;I)Lnet/time4j/tz/p;

    .line 117
    .line 118
    .line 119
    move-result-object v2

    .line 120
    invoke-interface {v1, v4, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    new-instance v2, Lhj/f;

    .line 124
    .line 125
    sget-object v3, Lhj/b0;->l:Lhj/b0;

    .line 126
    .line 127
    new-instance v4, Lhj/c$a;

    .line 128
    .line 129
    invoke-direct {v4}, Lhj/c$a;-><init>()V

    .line 130
    .line 131
    .line 132
    new-instance v5, Lhj/c$b;

    .line 133
    .line 134
    invoke-direct {v5, v1}, Lhj/c$b;-><init>(Ljava/util/Map;)V

    .line 135
    .line 136
    .line 137
    invoke-direct {v2, v3, v4, v5}, Lhj/f;-><init>(Lfj/p;Lhj/e;Lhj/d;)V

    .line 138
    .line 139
    .line 140
    invoke-static {v0, v2}, Lhj/c$d;->a(Lhj/c$d;Lhj/h;)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {v0}, Lhj/c$d;->F()Lhj/c;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    sget-object v1, Lnet/time4j/tz/p;->u:Lnet/time4j/tz/p;

    .line 148
    .line 149
    invoke-virtual {v0, v1}, Lhj/c;->V(Lnet/time4j/tz/k;)Lhj/c;

    .line 150
    .line 151
    .line 152
    move-result-object v0

    .line 153
    return-object v0
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
.end method

.method private static M(Lhj/c$d;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhj/c$d<",
            "Lnet/time4j/a0;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lhj/c$d;->X()Lhj/c$d;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    sget-object v0, Lgj/a;->g:Lfj/c;

    .line 6
    .line 7
    sget-object v1, Lgj/v;->l:Lgj/v;

    .line 8
    .line 9
    invoke-virtual {p0, v0, v1}, Lhj/c$d;->b0(Lfj/c;Ljava/lang/Enum;)Lhj/c$d;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    sget-object v2, Lnet/time4j/f0;->F:Lnet/time4j/c0;

    .line 14
    .line 15
    invoke-virtual {p0, v2}, Lhj/c$d;->z(Lfj/p;)Lhj/c$d;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-virtual {p0}, Lhj/c$d;->L()Lhj/c$d;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    const-string v2, ", "

    .line 24
    .line 25
    invoke-virtual {p0, v2}, Lhj/c$d;->n(Ljava/lang/String;)Lhj/c$d;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-virtual {p0}, Lhj/c$d;->L()Lhj/c$d;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    sget-object v2, Lnet/time4j/f0;->E:Lnet/time4j/k0;

    .line 34
    .line 35
    const/4 v3, 0x1

    .line 36
    const/4 v4, 0x2

    .line 37
    invoke-virtual {p0, v2, v3, v4}, Lhj/c$d;->j(Lfj/p;II)Lhj/c$d;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    const/16 v2, 0x20

    .line 42
    .line 43
    invoke-virtual {p0, v2}, Lhj/c$d;->l(C)Lhj/c$d;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    invoke-virtual {p0, v0, v1}, Lhj/c$d;->b0(Lfj/c;Ljava/lang/Enum;)Lhj/c$d;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    sget-object v0, Lnet/time4j/f0;->C:Lnet/time4j/c0;

    .line 52
    .line 53
    invoke-virtual {p0, v0}, Lhj/c$d;->z(Lfj/p;)Lhj/c$d;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    invoke-virtual {p0}, Lhj/c$d;->L()Lhj/c$d;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    invoke-virtual {p0, v2}, Lhj/c$d;->l(C)Lhj/c$d;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    sget-object v0, Lnet/time4j/f0;->z:Lnet/time4j/c;

    .line 66
    .line 67
    const/4 v1, 0x4

    .line 68
    invoke-virtual {p0, v0, v1}, Lhj/c$d;->g(Lfj/p;I)Lhj/c$d;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    invoke-virtual {p0, v2}, Lhj/c$d;->l(C)Lhj/c$d;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    sget-object v0, Lnet/time4j/g0;->E:Lnet/time4j/k0;

    .line 77
    .line 78
    invoke-virtual {p0, v0, v4}, Lhj/c$d;->g(Lfj/p;I)Lhj/c$d;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    const/16 v0, 0x3a

    .line 83
    .line 84
    invoke-virtual {p0, v0}, Lhj/c$d;->l(C)Lhj/c$d;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    sget-object v1, Lnet/time4j/g0;->G:Lnet/time4j/k0;

    .line 89
    .line 90
    invoke-virtual {p0, v1, v4}, Lhj/c$d;->g(Lfj/p;I)Lhj/c$d;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    invoke-virtual {p0}, Lhj/c$d;->X()Lhj/c$d;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    invoke-virtual {p0, v0}, Lhj/c$d;->l(C)Lhj/c$d;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    sget-object v0, Lnet/time4j/g0;->I:Lnet/time4j/k0;

    .line 103
    .line 104
    invoke-virtual {p0, v0, v4}, Lhj/c$d;->g(Lfj/p;I)Lhj/c$d;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    invoke-virtual {p0}, Lhj/c$d;->L()Lhj/c$d;

    .line 109
    .line 110
    .line 111
    move-result-object p0

    .line 112
    invoke-virtual {p0, v2}, Lhj/c$d;->l(C)Lhj/c$d;

    .line 113
    .line 114
    .line 115
    return-void
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
.end method

.method public static N(Ljava/lang/Class;Ljava/util/Locale;)Lhj/c$d;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lfj/q<",
            "TT;>;>(",
            "Ljava/lang/Class<",
            "TT;>;",
            "Ljava/util/Locale;",
            ")",
            "Lhj/c$d<",
            "TT;>;"
        }
    .end annotation

    .line 1
    if-eqz p0, :cond_1

    .line 2
    .line 3
    invoke-static {p0}, Lfj/x;->A(Ljava/lang/Class;)Lfj/x;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    new-instance p0, Lhj/c$d;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-direct {p0, v0, p1, v1}, Lhj/c$d;-><init>(Lfj/x;Ljava/util/Locale;Lhj/c$a;)V

    .line 13
    .line 14
    .line 15
    return-object p0

    .line 16
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 17
    .line 18
    new-instance v0, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 21
    .line 22
    .line 23
    const-string v1, "Not formattable: "

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    throw p1

    .line 39
    :cond_1
    new-instance p0, Ljava/lang/NullPointerException;

    .line 40
    .line 41
    const-string p1, "Missing chronological type."

    .line 42
    .line 43
    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    throw p0
    .line 47
    .line 48
    .line 49
.end method

.method private static O(Lfj/q;Lfj/p;Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">(",
            "Lfj/q<",
            "*>;",
            "Lfj/p<",
            "TV;>;",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    invoke-interface {p1}, Lfj/p;->getType()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lfj/q;->E(Lfj/p;Ljava/lang/Object;)Lfj/q;

    return-void
.end method

.method private static P(ILjava/lang/CharSequence;)Ljava/lang/String;
    .locals 3

    .line 1
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    sub-int v1, v0, p0

    .line 6
    .line 7
    const/16 v2, 0xa

    .line 8
    .line 9
    if-gt v1, v2, :cond_0

    .line 10
    .line 11
    invoke-interface {p1, p0, v0}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-interface {p0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0

    .line 20
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 23
    .line 24
    .line 25
    add-int/lit8 v1, p0, 0xa

    .line 26
    .line 27
    invoke-interface {p1, p0, v1}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-interface {p0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    const-string p0, "..."

    .line 39
    .line 40
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    return-object p0
    .line 48
    .line 49
.end method

.method private static Q(Lfj/q;Lfj/p;Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lfj/q<",
            "*>;",
            "Lfj/p<",
            "TT;>;",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    invoke-interface {p1}, Lfj/p;->getType()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lfj/q;->E(Lfj/p;Ljava/lang/Object;)Lfj/q;

    return-void
.end method

.method static synthetic c(Lfj/x;Lfj/x;Lfj/p;)Lfj/x;
    .locals 0

    invoke-static {p0, p1, p2}, Lhj/c;->j(Lfj/x;Lfj/x;Lfj/p;)Lfj/x;

    move-result-object p0

    return-object p0
.end method

.method static synthetic d(Lfj/x;Lfj/x;Lfj/x;)I
    .locals 0

    invoke-static {p0, p1, p2}, Lhj/c;->s(Lfj/x;Lfj/x;Lfj/x;)I

    move-result p0

    return p0
.end method

.method static synthetic e(Lhj/c;)Lhj/b;
    .locals 0

    iget-object p0, p0, Lhj/c;->c:Lhj/b;

    return-object p0
.end method

.method static synthetic f(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0}, Lhj/c;->h(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private static g(Lhj/c$d;Ljava/lang/String;Lhj/w;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lhj/c$d<",
            "TT;>;",
            "Ljava/lang/String;",
            "Lhj/w;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    new-instance v1, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 8
    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    move v3, v2

    .line 12
    :goto_0
    const/4 v4, 0x1

    .line 13
    if-ge v3, v0, :cond_6

    .line 14
    .line 15
    invoke-virtual {p1, v3}, Ljava/lang/String;->charAt(I)C

    .line 16
    .line 17
    .line 18
    move-result v5

    .line 19
    const/16 v6, 0x27

    .line 20
    .line 21
    if-ne v5, v6, :cond_5

    .line 22
    .line 23
    add-int/lit8 v5, v3, 0x1

    .line 24
    .line 25
    invoke-virtual {p1, v5}, Ljava/lang/String;->charAt(I)C

    .line 26
    .line 27
    .line 28
    move-result v7

    .line 29
    const/16 v8, 0x5a

    .line 30
    .line 31
    if-ne v7, v8, :cond_0

    .line 32
    .line 33
    move v7, v4

    .line 34
    goto :goto_1

    .line 35
    :cond_0
    move v7, v2

    .line 36
    :goto_1
    if-ge v5, v0, :cond_4

    .line 37
    .line 38
    invoke-virtual {p1, v5}, Ljava/lang/String;->charAt(I)C

    .line 39
    .line 40
    .line 41
    move-result v8

    .line 42
    if-ne v8, v6, :cond_3

    .line 43
    .line 44
    add-int/lit8 v8, v5, 0x1

    .line 45
    .line 46
    if-ge v8, v0, :cond_1

    .line 47
    .line 48
    invoke-virtual {p1, v8}, Ljava/lang/String;->charAt(I)C

    .line 49
    .line 50
    .line 51
    move-result v9

    .line 52
    if-ne v9, v6, :cond_1

    .line 53
    .line 54
    move v5, v8

    .line 55
    goto :goto_2

    .line 56
    :cond_1
    if-eqz v7, :cond_4

    .line 57
    .line 58
    add-int/lit8 v3, v3, 0x2

    .line 59
    .line 60
    if-ne v5, v3, :cond_4

    .line 61
    .line 62
    invoke-static {p0}, Lhj/c$d;->b(Lhj/c$d;)Lfj/x;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    invoke-static {v3}, Lhj/c$d;->c(Lfj/x;)Z

    .line 67
    .line 68
    .line 69
    move-result v3

    .line 70
    if-nez v3, :cond_2

    .line 71
    .line 72
    goto :goto_3

    .line 73
    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 74
    .line 75
    new-instance p2, Ljava/lang/StringBuilder;

    .line 76
    .line 77
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 78
    .line 79
    .line 80
    const-string v0, "Z-literal (=UTC+00) should not be escaped: "

    .line 81
    .line 82
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    throw p0

    .line 96
    :cond_3
    :goto_2
    add-int/2addr v5, v4

    .line 97
    goto :goto_1

    .line 98
    :cond_4
    :goto_3
    move v3, v5

    .line 99
    goto :goto_4

    .line 100
    :cond_5
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    :goto_4
    add-int/2addr v3, v4

    .line 104
    goto :goto_0

    .line 105
    :cond_6
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    sget-object v1, Lhj/c$c;->a:[I

    .line 110
    .line 111
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 112
    .line 113
    .line 114
    move-result v2

    .line 115
    aget v1, v1, v2

    .line 116
    .line 117
    if-eq v1, v4, :cond_7

    .line 118
    .line 119
    const/4 v2, 0x2

    .line 120
    if-eq v1, v2, :cond_7

    .line 121
    .line 122
    const/4 v2, 0x3

    .line 123
    if-eq v1, v2, :cond_7

    .line 124
    .line 125
    const/4 v2, 0x4

    .line 126
    if-eq v1, v2, :cond_7

    .line 127
    .line 128
    goto/16 :goto_7

    .line 129
    .line 130
    :cond_7
    const-string v1, "h"

    .line 131
    .line 132
    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 133
    .line 134
    .line 135
    move-result v1

    .line 136
    if-nez v1, :cond_8

    .line 137
    .line 138
    const-string v1, "K"

    .line 139
    .line 140
    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 141
    .line 142
    .line 143
    move-result v1

    .line 144
    if-eqz v1, :cond_a

    .line 145
    .line 146
    :cond_8
    const-string v1, "a"

    .line 147
    .line 148
    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 149
    .line 150
    .line 151
    move-result v1

    .line 152
    if-nez v1, :cond_a

    .line 153
    .line 154
    const-string v1, "b"

    .line 155
    .line 156
    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 157
    .line 158
    .line 159
    move-result v1

    .line 160
    if-nez v1, :cond_a

    .line 161
    .line 162
    const-string v1, "B"

    .line 163
    .line 164
    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 165
    .line 166
    .line 167
    move-result v1

    .line 168
    if-eqz v1, :cond_9

    .line 169
    .line 170
    goto :goto_5

    .line 171
    :cond_9
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 172
    .line 173
    new-instance p2, Ljava/lang/StringBuilder;

    .line 174
    .line 175
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 176
    .line 177
    .line 178
    const-string v0, "12-hour-clock requires am/pm-marker or dayperiod: "

    .line 179
    .line 180
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 181
    .line 182
    .line 183
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 184
    .line 185
    .line 186
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object p1

    .line 190
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 191
    .line 192
    .line 193
    throw p0

    .line 194
    :cond_a
    :goto_5
    const-string v1, "Y"

    .line 195
    .line 196
    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 197
    .line 198
    .line 199
    move-result v1

    .line 200
    const-string v2, "L"

    .line 201
    .line 202
    const-string v3, "M"

    .line 203
    .line 204
    if-eqz v1, :cond_d

    .line 205
    .line 206
    invoke-virtual {v0, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 207
    .line 208
    .line 209
    move-result v1

    .line 210
    if-nez v1, :cond_b

    .line 211
    .line 212
    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 213
    .line 214
    .line 215
    move-result v1

    .line 216
    if-eqz v1, :cond_d

    .line 217
    .line 218
    :cond_b
    const-string v1, "w"

    .line 219
    .line 220
    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 221
    .line 222
    .line 223
    move-result v1

    .line 224
    if-eqz v1, :cond_c

    .line 225
    .line 226
    goto :goto_6

    .line 227
    :cond_c
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 228
    .line 229
    new-instance p2, Ljava/lang/StringBuilder;

    .line 230
    .line 231
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 232
    .line 233
    .line 234
    const-string v0, "Y as week-based-year requires a week-date-format: "

    .line 235
    .line 236
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 237
    .line 238
    .line 239
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 240
    .line 241
    .line 242
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 243
    .line 244
    .line 245
    move-result-object p1

    .line 246
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 247
    .line 248
    .line 249
    throw p0

    .line 250
    :cond_d
    :goto_6
    const-string v1, "D"

    .line 251
    .line 252
    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 253
    .line 254
    .line 255
    move-result v1

    .line 256
    if-eqz v1, :cond_10

    .line 257
    .line 258
    invoke-virtual {v0, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 259
    .line 260
    .line 261
    move-result v1

    .line 262
    if-nez v1, :cond_e

    .line 263
    .line 264
    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 265
    .line 266
    .line 267
    move-result v1

    .line 268
    if-eqz v1, :cond_10

    .line 269
    .line 270
    :cond_e
    const-string v1, "d"

    .line 271
    .line 272
    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 273
    .line 274
    .line 275
    move-result v0

    .line 276
    if-eqz v0, :cond_f

    .line 277
    .line 278
    goto :goto_7

    .line 279
    :cond_f
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 280
    .line 281
    new-instance p2, Ljava/lang/StringBuilder;

    .line 282
    .line 283
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 284
    .line 285
    .line 286
    const-string v0, "D is the day of year but not the day of month: "

    .line 287
    .line 288
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 289
    .line 290
    .line 291
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 292
    .line 293
    .line 294
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 295
    .line 296
    .line 297
    move-result-object p1

    .line 298
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 299
    .line 300
    .line 301
    throw p0

    .line 302
    :cond_10
    :goto_7
    invoke-virtual {p0, p1, p2}, Lhj/c$d;->v(Ljava/lang/String;Lhj/w;)Lhj/c$d;

    .line 303
    .line 304
    .line 305
    return-void
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
.end method

.method private static h(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Object;",
            ")TT;"
        }
    .end annotation

    return-object p0
.end method

.method private static i(Lfj/q;Ljava/lang/Object;Ljava/lang/CharSequence;Lhj/s;)Ljava/lang/Object;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lfj/q<",
            "*>;TT;",
            "Ljava/lang/CharSequence;",
            "Lhj/s;",
            ")TT;"
        }
    .end annotation

    .line 1
    instance-of v0, p1, Lnet/time4j/base/f;

    .line 2
    .line 3
    const-string v1, "}."

    .line 4
    .line 5
    const-string v2, "Conflict found: "

    .line 6
    .line 7
    const/16 v3, 0x100

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    if-eqz v0, :cond_2

    .line 11
    .line 12
    const-class v0, Lnet/time4j/base/f;

    .line 13
    .line 14
    invoke-virtual {v0, p1}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, Lnet/time4j/base/f;

    .line 19
    .line 20
    sget-object v5, Lhj/b0;->k:Lhj/b0;

    .line 21
    .line 22
    invoke-virtual {p0, v5}, Lfj/q;->o(Lfj/p;)Z

    .line 23
    .line 24
    .line 25
    move-result v6

    .line 26
    if-eqz v6, :cond_0

    .line 27
    .line 28
    sget-object v6, Lhj/b0;->l:Lhj/b0;

    .line 29
    .line 30
    invoke-virtual {p0, v6}, Lfj/q;->o(Lfj/p;)Z

    .line 31
    .line 32
    .line 33
    move-result v7

    .line 34
    if-eqz v7, :cond_0

    .line 35
    .line 36
    invoke-virtual {p0, v5}, Lfj/q;->k(Lfj/p;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v5

    .line 40
    check-cast v5, Lnet/time4j/tz/k;

    .line 41
    .line 42
    invoke-virtual {p0, v6}, Lfj/q;->k(Lfj/p;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v6

    .line 46
    check-cast v6, Lnet/time4j/tz/k;

    .line 47
    .line 48
    invoke-static {v5}, Lnet/time4j/tz/l;->N(Lnet/time4j/tz/k;)Lnet/time4j/tz/l;

    .line 49
    .line 50
    .line 51
    move-result-object v7

    .line 52
    invoke-virtual {v7, v0}, Lnet/time4j/tz/l;->B(Lnet/time4j/base/f;)Lnet/time4j/tz/p;

    .line 53
    .line 54
    .line 55
    move-result-object v7

    .line 56
    invoke-virtual {v7, v6}, Lnet/time4j/tz/p;->equals(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v7

    .line 60
    if-nez v7, :cond_0

    .line 61
    .line 62
    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    .line 63
    .line 64
    .line 65
    move-result p0

    .line 66
    new-instance p1, Ljava/lang/StringBuilder;

    .line 67
    .line 68
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 69
    .line 70
    .line 71
    const-string p2, "Ambivalent offset information: "

    .line 72
    .line 73
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    invoke-virtual {p1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    const-string p2, " versus "

    .line 80
    .line 81
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {p1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    invoke-virtual {p3, p0, p1}, Lhj/s;->k(ILjava/lang/String;)V

    .line 92
    .line 93
    .line 94
    return-object v4

    .line 95
    :cond_0
    sget-object v5, Lfj/b0;->l:Lfj/b0;

    .line 96
    .line 97
    invoke-virtual {p0, v5}, Lfj/q;->o(Lfj/p;)Z

    .line 98
    .line 99
    .line 100
    move-result v6

    .line 101
    if-eqz v6, :cond_b

    .line 102
    .line 103
    invoke-virtual {p0}, Lfj/q;->r()Lnet/time4j/tz/k;

    .line 104
    .line 105
    .line 106
    move-result-object v6

    .line 107
    :try_start_0
    invoke-static {v6}, Lnet/time4j/tz/l;->N(Lnet/time4j/tz/k;)Lnet/time4j/tz/l;

    .line 108
    .line 109
    .line 110
    move-result-object v6

    .line 111
    invoke-virtual {v6, v0}, Lnet/time4j/tz/l;->I(Lnet/time4j/base/f;)Z

    .line 112
    .line 113
    .line 114
    move-result v0

    .line 115
    invoke-virtual {p0, v5}, Lfj/q;->k(Lfj/p;)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object p0

    .line 119
    check-cast p0, Ljava/lang/Boolean;

    .line 120
    .line 121
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 122
    .line 123
    .line 124
    move-result p0

    .line 125
    if-eq v0, p0, :cond_b

    .line 126
    .line 127
    new-instance p0, Ljava/lang/StringBuilder;

    .line 128
    .line 129
    invoke-direct {p0, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 133
    .line 134
    .line 135
    const-string p1, "Parsed entity is "

    .line 136
    .line 137
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 138
    .line 139
    .line 140
    if-nez v0, :cond_1

    .line 141
    .line 142
    const-string p1, "not "

    .line 143
    .line 144
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 145
    .line 146
    .line 147
    :cond_1
    const-string p1, "daylight-saving, but timezone name"

    .line 148
    .line 149
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 150
    .line 151
    .line 152
    const-string p1, " has not the appropriate form in {"

    .line 153
    .line 154
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 155
    .line 156
    .line 157
    invoke-interface {p2}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object p1

    .line 161
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 162
    .line 163
    .line 164
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 165
    .line 166
    .line 167
    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    .line 168
    .line 169
    .line 170
    move-result p1

    .line 171
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object p0

    .line 175
    invoke-virtual {p3, p1, p0}, Lhj/s;->k(ILjava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 176
    .line 177
    .line 178
    move-object p1, v4

    .line 179
    goto/16 :goto_4

    .line 180
    .line 181
    :catch_0
    move-exception p0

    .line 182
    new-instance p1, Ljava/lang/StringBuilder;

    .line 183
    .line 184
    invoke-direct {p1, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 185
    .line 186
    .line 187
    const-string v0, "Unable to check timezone name: "

    .line 188
    .line 189
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 190
    .line 191
    .line 192
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object p0

    .line 196
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 197
    .line 198
    .line 199
    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    .line 200
    .line 201
    .line 202
    move-result p0

    .line 203
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 204
    .line 205
    .line 206
    move-result-object p1

    .line 207
    invoke-virtual {p3, p0, p1}, Lhj/s;->k(ILjava/lang/String;)V

    .line 208
    .line 209
    .line 210
    return-object v4

    .line 211
    :cond_2
    instance-of v0, p1, Lfj/o;

    .line 212
    .line 213
    if-eqz v0, :cond_b

    .line 214
    .line 215
    move-object v0, p1

    .line 216
    check-cast v0, Lfj/o;

    .line 217
    .line 218
    instance-of v5, p1, Lnet/time4j/h0;

    .line 219
    .line 220
    if-eqz v5, :cond_4

    .line 221
    .line 222
    const-class v5, Lnet/time4j/h0;

    .line 223
    .line 224
    invoke-virtual {v5, p1}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object v6

    .line 228
    check-cast v6, Lnet/time4j/h0;

    .line 229
    .line 230
    invoke-virtual {v6}, Lnet/time4j/h0;->q()I

    .line 231
    .line 232
    .line 233
    move-result v6

    .line 234
    if-nez v6, :cond_4

    .line 235
    .line 236
    sget-object v6, Lnet/time4j/g0;->F:Lnet/time4j/k0;

    .line 237
    .line 238
    invoke-virtual {p0, v6}, Lfj/q;->m(Lfj/p;)I

    .line 239
    .line 240
    .line 241
    move-result v6

    .line 242
    const/16 v7, 0x18

    .line 243
    .line 244
    if-eq v6, v7, :cond_3

    .line 245
    .line 246
    sget-object v6, Lnet/time4j/g0;->z:Lnet/time4j/u0;

    .line 247
    .line 248
    invoke-virtual {p0, v6}, Lfj/q;->o(Lfj/p;)Z

    .line 249
    .line 250
    .line 251
    move-result v8

    .line 252
    if-eqz v8, :cond_4

    .line 253
    .line 254
    invoke-virtual {p0, v6}, Lfj/q;->k(Lfj/p;)Ljava/lang/Object;

    .line 255
    .line 256
    .line 257
    move-result-object v6

    .line 258
    check-cast v6, Lnet/time4j/g0;

    .line 259
    .line 260
    invoke-virtual {v6}, Lnet/time4j/g0;->q()I

    .line 261
    .line 262
    .line 263
    move-result v6

    .line 264
    if-ne v6, v7, :cond_4

    .line 265
    .line 266
    :cond_3
    invoke-virtual {v5, p1}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    .line 267
    .line 268
    .line 269
    move-result-object v5

    .line 270
    check-cast v5, Lnet/time4j/h0;

    .line 271
    .line 272
    invoke-virtual {v5}, Lnet/time4j/h0;->i0()Lnet/time4j/f0;

    .line 273
    .line 274
    .line 275
    move-result-object v5

    .line 276
    const-wide/16 v6, 0x1

    .line 277
    .line 278
    sget-object v8, Lnet/time4j/f;->r:Lnet/time4j/f;

    .line 279
    .line 280
    invoke-virtual {v5, v6, v7, v8}, Lfj/k0;->J(JLjava/lang/Object;)Lfj/k0;

    .line 281
    .line 282
    .line 283
    move-result-object v5

    .line 284
    goto :goto_0

    .line 285
    :cond_4
    move-object v5, v4

    .line 286
    :goto_0
    invoke-virtual {p0}, Lfj/q;->x()Ljava/util/Set;

    .line 287
    .line 288
    .line 289
    move-result-object v6

    .line 290
    invoke-interface {v6}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 291
    .line 292
    .line 293
    move-result-object v6

    .line 294
    :cond_5
    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 295
    .line 296
    .line 297
    move-result v7

    .line 298
    if-eqz v7, :cond_b

    .line 299
    .line 300
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 301
    .line 302
    .line 303
    move-result-object v7

    .line 304
    check-cast v7, Lfj/p;

    .line 305
    .line 306
    sget-object v8, Lnet/time4j/g0;->I:Lnet/time4j/k0;

    .line 307
    .line 308
    if-ne v7, v8, :cond_6

    .line 309
    .line 310
    invoke-virtual {p0, v8}, Lfj/q;->m(Lfj/p;)I

    .line 311
    .line 312
    .line 313
    move-result v8

    .line 314
    const/16 v9, 0x3c

    .line 315
    .line 316
    if-ne v8, v9, :cond_6

    .line 317
    .line 318
    goto :goto_1

    .line 319
    :cond_6
    if-eqz v5, :cond_8

    .line 320
    .line 321
    invoke-interface {v7}, Lfj/p;->G()Z

    .line 322
    .line 323
    .line 324
    move-result v8

    .line 325
    if-eqz v8, :cond_7

    .line 326
    .line 327
    move-object v0, v5

    .line 328
    goto :goto_2

    .line 329
    :cond_7
    invoke-interface {v7}, Lfj/p;->T()Z

    .line 330
    .line 331
    .line 332
    move-result v8

    .line 333
    if-eqz v8, :cond_8

    .line 334
    .line 335
    invoke-static {}, Lnet/time4j/g0;->H0()Lnet/time4j/g0;

    .line 336
    .line 337
    .line 338
    move-result-object v0

    .line 339
    :cond_8
    :goto_2
    invoke-interface {v0, v7}, Lfj/o;->o(Lfj/p;)Z

    .line 340
    .line 341
    .line 342
    move-result v8

    .line 343
    if-eqz v8, :cond_5

    .line 344
    .line 345
    invoke-interface {v7}, Lfj/p;->getType()Ljava/lang/Class;

    .line 346
    .line 347
    .line 348
    move-result-object v8

    .line 349
    const-class v9, Ljava/lang/Integer;

    .line 350
    .line 351
    if-ne v8, v9, :cond_a

    .line 352
    .line 353
    invoke-static {v7}, Lhj/c;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 354
    .line 355
    .line 356
    move-result-object v8

    .line 357
    check-cast v8, Lfj/p;

    .line 358
    .line 359
    invoke-virtual {p0, v8}, Lfj/q;->m(Lfj/p;)I

    .line 360
    .line 361
    .line 362
    move-result v9

    .line 363
    invoke-interface {v0, v8}, Lfj/o;->m(Lfj/p;)I

    .line 364
    .line 365
    .line 366
    move-result v8

    .line 367
    if-eq v8, v9, :cond_9

    .line 368
    .line 369
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 370
    .line 371
    .line 372
    move-result-object v8

    .line 373
    const/4 v9, 0x0

    .line 374
    goto :goto_3

    .line 375
    :cond_9
    const/4 v9, 0x1

    .line 376
    move-object v8, v4

    .line 377
    goto :goto_3

    .line 378
    :cond_a
    invoke-virtual {p0, v7}, Lfj/q;->k(Lfj/p;)Ljava/lang/Object;

    .line 379
    .line 380
    .line 381
    move-result-object v8

    .line 382
    invoke-interface {v0, v7}, Lfj/o;->k(Lfj/p;)Ljava/lang/Object;

    .line 383
    .line 384
    .line 385
    move-result-object v9

    .line 386
    invoke-virtual {v9, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 387
    .line 388
    .line 389
    move-result v9

    .line 390
    :goto_3
    if-nez v9, :cond_5

    .line 391
    .line 392
    new-instance p0, Ljava/lang/StringBuilder;

    .line 393
    .line 394
    invoke-direct {p0, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 395
    .line 396
    .line 397
    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 398
    .line 399
    .line 400
    const-string p1, "Text {"

    .line 401
    .line 402
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 403
    .line 404
    .line 405
    invoke-interface {p2}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 406
    .line 407
    .line 408
    move-result-object p1

    .line 409
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 410
    .line 411
    .line 412
    const-string p1, "} with element "

    .line 413
    .line 414
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 415
    .line 416
    .line 417
    invoke-interface {v7}, Lfj/p;->name()Ljava/lang/String;

    .line 418
    .line 419
    .line 420
    move-result-object p1

    .line 421
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 422
    .line 423
    .line 424
    const-string p1, " {"

    .line 425
    .line 426
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 427
    .line 428
    .line 429
    invoke-virtual {p0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 430
    .line 431
    .line 432
    const-string p1, "}, but parsed entity "

    .line 433
    .line 434
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 435
    .line 436
    .line 437
    const-string p1, "has element value {"

    .line 438
    .line 439
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 440
    .line 441
    .line 442
    invoke-interface {v0, v7}, Lfj/o;->k(Lfj/p;)Ljava/lang/Object;

    .line 443
    .line 444
    .line 445
    move-result-object p1

    .line 446
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 447
    .line 448
    .line 449
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 450
    .line 451
    .line 452
    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    .line 453
    .line 454
    .line 455
    move-result p1

    .line 456
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 457
    .line 458
    .line 459
    move-result-object p0

    .line 460
    invoke-virtual {p3, p1, p0}, Lhj/s;->k(ILjava/lang/String;)V

    .line 461
    .line 462
    .line 463
    return-object v4

    .line 464
    :cond_b
    :goto_4
    return-object p1
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
.end method

.method private static j(Lfj/x;Lfj/x;Lfj/p;)Lfj/x;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfj/x<",
            "*>;",
            "Lfj/x<",
            "*>;",
            "Lfj/p<",
            "*>;)",
            "Lfj/x<",
            "*>;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p2}, Lfj/x;->y(Lfj/p;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    if-nez p1, :cond_2

    .line 9
    .line 10
    :cond_1
    invoke-virtual {p0}, Lfj/x;->d()Lfj/x;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    if-eqz p0, :cond_4

    .line 15
    .line 16
    invoke-virtual {p0, p2}, Lfj/x;->y(Lfj/p;)Z

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    if-eqz p1, :cond_1

    .line 21
    .line 22
    return-object p0

    .line 23
    :cond_2
    invoke-interface {p2}, Lfj/p;->G()Z

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    if-eqz p0, :cond_3

    .line 28
    .line 29
    invoke-virtual {p1, p2}, Lfj/x;->y(Lfj/p;)Z

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    if-eqz p0, :cond_3

    .line 34
    .line 35
    return-object p1

    .line 36
    :cond_3
    invoke-interface {p2}, Lfj/p;->T()Z

    .line 37
    .line 38
    .line 39
    move-result p0

    .line 40
    if-eqz p0, :cond_4

    .line 41
    .line 42
    invoke-static {}, Lnet/time4j/g0;->l0()Lfj/h0;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    invoke-virtual {p0, p2}, Lfj/x;->y(Lfj/p;)Z

    .line 47
    .line 48
    .line 49
    move-result p0

    .line 50
    if-eqz p0, :cond_4

    .line 51
    .line 52
    invoke-static {}, Lnet/time4j/g0;->l0()Lfj/h0;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    return-object p0

    .line 57
    :cond_4
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 58
    .line 59
    new-instance p1, Ljava/lang/StringBuilder;

    .line 60
    .line 61
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 62
    .line 63
    .line 64
    const-string v0, "Unsupported element: "

    .line 65
    .line 66
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-interface {p2}, Lfj/p;->name()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p2

    .line 73
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    throw p0
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
.end method

.method private k(Ljava/lang/Object;Lfj/d;)Lfj/o;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lfj/d;",
            ")",
            "Lfj/o;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lhj/c;->b:Lhj/c$e;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lhj/c;->a:Lfj/x;

    .line 6
    .line 7
    invoke-virtual {v0, p1, p2}, Lfj/x;->k(Ljava/lang/Object;Lfj/d;)Lfj/o;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1

    .line 12
    :cond_0
    :try_start_0
    invoke-virtual {v0}, Lhj/c$e;->e()Lfj/x;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {v0}, Lfj/x;->q()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    sget-object v1, Lgj/a;->u:Lfj/c;

    .line 21
    .line 22
    iget-object v2, p0, Lhj/c;->b:Lhj/c$e;

    .line 23
    .line 24
    invoke-virtual {v2}, Lhj/c$e;->a()Lfj/f0;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-interface {p2, v1, v2}, Lfj/d;->a(Lfj/c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    check-cast v1, Lfj/f0;

    .line 33
    .line 34
    const-class v2, Lnet/time4j/a0;

    .line 35
    .line 36
    invoke-virtual {v2, p1}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    check-cast v2, Lnet/time4j/a0;

    .line 41
    .line 42
    sget-object v3, Lgj/a;->d:Lfj/c;

    .line 43
    .line 44
    invoke-interface {p2, v3}, Lfj/d;->c(Lfj/c;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    check-cast v3, Lnet/time4j/tz/k;

    .line 49
    .line 50
    const-string v4, ""

    .line 51
    .line 52
    const-class v5, Lfj/l;

    .line 53
    .line 54
    invoke-virtual {v5, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 55
    .line 56
    .line 57
    move-result v5

    .line 58
    if-eqz v5, :cond_1

    .line 59
    .line 60
    iget-object v0, p0, Lhj/c;->b:Lhj/c$e;

    .line 61
    .line 62
    invoke-virtual {v0}, Lhj/c$e;->e()Lfj/x;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    invoke-static {v0}, Lhj/c;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    check-cast v0, Lfj/j;

    .line 71
    .line 72
    sget-object v4, Lgj/a;->t:Lfj/c;

    .line 73
    .line 74
    invoke-interface {p2, v4}, Lfj/d;->c(Lfj/c;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object p2

    .line 78
    move-object v4, p2

    .line 79
    check-cast v4, Ljava/lang/String;

    .line 80
    .line 81
    invoke-virtual {v2, v0, v4, v3, v1}, Lnet/time4j/a0;->s0(Lfj/j;Ljava/lang/String;Lnet/time4j/tz/k;Lfj/f0;)Lnet/time4j/r;

    .line 82
    .line 83
    .line 84
    move-result-object p2

    .line 85
    goto :goto_0

    .line 86
    :cond_1
    const-class p2, Lfj/m;

    .line 87
    .line 88
    invoke-virtual {p2, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 89
    .line 90
    .line 91
    move-result p2

    .line 92
    if-eqz p2, :cond_2

    .line 93
    .line 94
    iget-object p2, p0, Lhj/c;->b:Lhj/c$e;

    .line 95
    .line 96
    invoke-virtual {p2}, Lhj/c$e;->e()Lfj/x;

    .line 97
    .line 98
    .line 99
    move-result-object p2

    .line 100
    invoke-virtual {v2, p2, v3, v1}, Lnet/time4j/a0;->t0(Lfj/x;Lnet/time4j/tz/k;Lfj/f0;)Lnet/time4j/r;

    .line 101
    .line 102
    .line 103
    move-result-object p2

    .line 104
    :goto_0
    new-instance v0, Lhj/c$f;

    .line 105
    .line 106
    const/4 v1, 0x0

    .line 107
    invoke-direct {v0, p2, v4, v3, v1}, Lhj/c$f;-><init>(Lnet/time4j/r;Ljava/lang/String;Lnet/time4j/tz/k;Lhj/c$a;)V

    .line 108
    .line 109
    .line 110
    return-object v0

    .line 111
    :cond_2
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 112
    .line 113
    new-instance v1, Ljava/lang/StringBuilder;

    .line 114
    .line 115
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 116
    .line 117
    .line 118
    const-string v2, "Unexpected calendar override: "

    .line 119
    .line 120
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 121
    .line 122
    .line 123
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    invoke-direct {p2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    throw p2
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/NoSuchElementException; {:try_start_0 .. :try_end_0} :catch_0

    .line 134
    :catch_0
    move-exception p1

    .line 135
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 136
    .line 137
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    invoke-direct {p2, v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 142
    .line 143
    .line 144
    throw p2

    .line 145
    :catch_1
    move-exception p2

    .line 146
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 147
    .line 148
    new-instance v1, Ljava/lang/StringBuilder;

    .line 149
    .line 150
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 151
    .line 152
    .line 153
    const-string v2, "Not formattable: "

    .line 154
    .line 155
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 156
    .line 157
    .line 158
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 159
    .line 160
    .line 161
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object p1

    .line 165
    invoke-direct {v0, p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 166
    .line 167
    .line 168
    throw v0
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
.end method

.method private m(Lfj/o;)Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    iget-object v1, p0, Lhj/c;->d:Ljava/util/List;

    .line 4
    .line 5
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    mul-int/lit8 v1, v1, 0x8

    .line 10
    .line 11
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 12
    .line 13
    .line 14
    :try_start_0
    iget-object v1, p0, Lhj/c;->c:Lhj/b;

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    invoke-virtual {p0, p1, v0, v1, v2}, Lhj/c;->J(Lfj/o;Ljava/lang/Appendable;Lfj/d;Z)Ljava/util/Set;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    return-object p1

    .line 25
    :catch_0
    move-exception p1

    .line 26
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 27
    .line 28
    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    .line 29
    .line 30
    .line 31
    throw v0
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
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
.end method

.method private n(Ljava/util/List;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lhj/i;",
            ">;)",
            "Ljava/util/List<",
            "Lhj/i;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 8
    .line 9
    .line 10
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    check-cast v1, Lhj/i;

    .line 25
    .line 26
    invoke-virtual {v1, p0}, Lhj/i;->s(Lhj/c;)Lhj/i;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    return-object p1
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
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
.end method

.method private static s(Lfj/x;Lfj/x;Lfj/x;)I
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfj/x<",
            "*>;",
            "Lfj/x<",
            "*>;",
            "Lfj/x<",
            "*>;)I"
        }
    .end annotation

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    const/4 p0, -0x1

    .line 4
    return p0

    .line 5
    :cond_0
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    const/4 v0, 0x0

    .line 10
    if-eqz p2, :cond_1

    .line 11
    .line 12
    return v0

    .line 13
    :cond_1
    invoke-virtual {p1}, Lfj/x;->d()Lfj/x;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    if-eqz p1, :cond_2

    .line 18
    .line 19
    add-int/lit8 v0, v0, 0x1

    .line 20
    .line 21
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result p2

    .line 25
    if-eqz p2, :cond_1

    .line 26
    .line 27
    return v0

    .line 28
    :cond_2
    const p0, 0x7fffffff

    .line 29
    .line 30
    .line 31
    return p0
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
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
.end method

.method private static t(Lfj/q;)Ljava/lang/String;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfj/q<",
            "*>;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lfj/q;->x()Ljava/util/Set;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    invoke-interface {v0}, Ljava/util/Set;->size()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    mul-int/lit8 v2, v2, 0x10

    .line 12
    .line 13
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 14
    .line 15
    .line 16
    const-string v2, " [parsed={"

    .line 17
    .line 18
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    const/4 v2, 0x1

    .line 26
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    if-eqz v3, :cond_1

    .line 31
    .line 32
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    check-cast v3, Lfj/p;

    .line 37
    .line 38
    if-eqz v2, :cond_0

    .line 39
    .line 40
    const/4 v2, 0x0

    .line 41
    goto :goto_1

    .line 42
    :cond_0
    const-string v4, ", "

    .line 43
    .line 44
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    :goto_1
    invoke-interface {v3}, Lfj/p;->name()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    const/16 v4, 0x3d

    .line 55
    .line 56
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0, v3}, Lfj/q;->k(Lfj/p;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_1
    const-string p0, "}]"

    .line 68
    .line 69
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    return-object p0
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
.end method

.method private static v(Lfj/q;)Ljava/lang/String;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfj/q<",
            "*>;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 1
    sget-object v0, Lfj/n0;->k:Lfj/n0;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lfj/q;->o(Lfj/p;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    new-instance v1, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 12
    .line 13
    .line 14
    const-string v2, "Validation failed => "

    .line 15
    .line 16
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0, v0}, Lfj/q;->k(Lfj/p;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    check-cast v2, Ljava/lang/String;

    .line 24
    .line 25
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    const/4 v2, 0x0

    .line 33
    invoke-virtual {p0, v0, v2}, Lfj/q;->E(Lfj/p;Ljava/lang/Object;)Lfj/q;

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    const-string v1, "Insufficient data:"

    .line 38
    .line 39
    :goto_0
    return-object v1
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
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
.end method

.method private w()Z
    .locals 4

    .line 1
    invoke-virtual {p0}, Lhj/c;->z()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    iget-object v1, p0, Lhj/c;->d:Ljava/util/List;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    check-cast v1, Lhj/i;

    .line 15
    .line 16
    invoke-virtual {v1}, Lhj/i;->d()Lhj/h;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    instance-of v3, v1, Lhj/f;

    .line 21
    .line 22
    if-eqz v3, :cond_0

    .line 23
    .line 24
    const-class v0, Lhj/f;

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    check-cast v0, Lhj/f;

    .line 31
    .line 32
    invoke-virtual {v0}, Lhj/f;->b()Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    goto :goto_0

    .line 37
    :cond_0
    instance-of v1, v1, Lhj/z;

    .line 38
    .line 39
    if-nez v1, :cond_1

    .line 40
    .line 41
    move v0, v2

    .line 42
    :cond_1
    :goto_0
    return v0
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
.end method

.method private x()Z
    .locals 1

    iget-object v0, p0, Lhj/c;->a:Lfj/x;

    invoke-virtual {v0}, Lfj/x;->d()Lfj/x;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lhj/c;->b:Lhj/c$e;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private static y(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    if-nez p0, :cond_1

    if-nez p1, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_0

    :cond_1
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    :goto_0
    return p0
.end method


# virtual methods
.method public F(Ljava/lang/CharSequence;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/CharSequence;",
            ")TT;"
        }
    .end annotation

    .line 1
    new-instance v0, Lhj/s;

    .line 2
    .line 3
    invoke-direct {v0}, Lhj/s;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1, v0}, Lhj/c;->G(Ljava/lang/CharSequence;Lhj/s;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    if-eqz v1, :cond_2

    .line 11
    .line 12
    invoke-virtual {v0}, Lhj/s;->f()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-boolean v2, p0, Lhj/c;->m:Z

    .line 17
    .line 18
    if-nez v2, :cond_1

    .line 19
    .line 20
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-lt v0, v2, :cond_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    new-instance v1, Ljava/text/ParseException;

    .line 28
    .line 29
    new-instance v2, Ljava/lang/StringBuilder;

    .line 30
    .line 31
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 32
    .line 33
    .line 34
    const-string v3, "Unparsed trailing characters: "

    .line 35
    .line 36
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-static {v0, p1}, Lhj/c;->P(ILjava/lang/CharSequence;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-direct {v1, p1, v0}, Ljava/text/ParseException;-><init>(Ljava/lang/String;I)V

    .line 51
    .line 52
    .line 53
    throw v1

    .line 54
    :cond_1
    :goto_0
    return-object v1

    .line 55
    :cond_2
    new-instance p1, Ljava/text/ParseException;

    .line 56
    .line 57
    invoke-virtual {v0}, Lhj/s;->d()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    invoke-virtual {v0}, Lhj/s;->c()I

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    invoke-direct {p1, v1, v0}, Ljava/text/ParseException;-><init>(Ljava/lang/String;I)V

    .line 66
    .line 67
    .line 68
    throw p1
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
.end method

.method public G(Ljava/lang/CharSequence;Lhj/s;)Ljava/lang/Object;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/CharSequence;",
            "Lhj/s;",
            ")TT;"
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Lhj/c;->n:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v2, p0, Lhj/c;->a:Lfj/x;

    .line 6
    .line 7
    invoke-virtual {v2}, Lfj/x;->s()Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    iget-object v6, p0, Lhj/c;->c:Lhj/b;

    .line 12
    .line 13
    iget-object v7, p0, Lhj/c;->k:Lgj/g;

    .line 14
    .line 15
    const/4 v8, 0x0

    .line 16
    const/4 v9, 0x1

    .line 17
    move-object v1, p0

    .line 18
    move-object v4, p1

    .line 19
    move-object v5, p2

    .line 20
    invoke-static/range {v1 .. v9}, Lhj/c;->D(Lhj/c;Lfj/u;Ljava/util/List;Ljava/lang/CharSequence;Lhj/s;Lfj/d;Lgj/g;ZZ)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    return-object p1

    .line 25
    :cond_0
    iget-object v0, p0, Lhj/c;->c:Lhj/b;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2, v0}, Lhj/c;->b(Ljava/lang/CharSequence;Lhj/s;Lfj/d;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    return-object p1
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

.method public I(Ljava/lang/Object;)Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lhj/c;->c:Lhj/b;

    .line 2
    .line 3
    invoke-direct {p0, p1, v0}, Lhj/c;->k(Ljava/lang/Object;Lfj/d;)Lfj/o;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-direct {p0, p1}, Lhj/c;->m(Lfj/o;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1
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
.end method

.method J(Lfj/o;Ljava/lang/Appendable;Lfj/d;Z)Ljava/util/Set;
    .locals 22
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfj/o;",
            "Ljava/lang/Appendable;",
            "Lfj/d;",
            "Z)",
            "Ljava/util/Set<",
            "Lhj/g;",
            ">;"
        }
    .end annotation

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v8, p1

    .line 4
    .line 5
    move-object/from16 v9, p2

    .line 6
    .line 7
    if-eqz v9, :cond_18

    .line 8
    .line 9
    iget-object v0, v1, Lhj/c;->d:Ljava/util/List;

    .line 10
    .line 11
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 12
    .line 13
    .line 14
    move-result v10

    .line 15
    iget-object v0, v1, Lhj/c;->c:Lhj/b;

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    move-object/from16 v12, p3

    .line 19
    .line 20
    if-ne v12, v0, :cond_0

    .line 21
    .line 22
    const/4 v13, 0x1

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move v13, v2

    .line 25
    :goto_0
    if-eqz p4, :cond_1

    .line 26
    .line 27
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 28
    .line 29
    invoke-direct {v0, v10}, Ljava/util/LinkedHashSet;-><init>(I)V

    .line 30
    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_1
    const/4 v0, 0x0

    .line 34
    :goto_1
    iget-boolean v3, v1, Lhj/c;->h:Z

    .line 35
    .line 36
    const-string v15, "Not formattable: "

    .line 37
    .line 38
    if-eqz v3, :cond_14

    .line 39
    .line 40
    new-instance v7, Ljava/util/LinkedList;

    .line 41
    .line 42
    invoke-direct {v7}, Ljava/util/LinkedList;-><init>()V

    .line 43
    .line 44
    .line 45
    new-instance v3, Ljava/lang/StringBuilder;

    .line 46
    .line 47
    shl-int/lit8 v4, v10, 0x2

    .line 48
    .line 49
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 50
    .line 51
    .line 52
    invoke-interface {v7, v3}, Ljava/util/Deque;->push(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    if-eqz p4, :cond_2

    .line 56
    .line 57
    new-instance v3, Ljava/util/LinkedList;

    .line 58
    .line 59
    invoke-direct {v3}, Ljava/util/LinkedList;-><init>()V

    .line 60
    .line 61
    .line 62
    invoke-interface {v3, v0}, Ljava/util/Deque;->push(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    move-object v6, v3

    .line 66
    goto :goto_2

    .line 67
    :cond_2
    const/4 v6, 0x0

    .line 68
    :goto_2
    move v5, v2

    .line 69
    :goto_3
    if-ge v5, v10, :cond_13

    .line 70
    .line 71
    iget-object v3, v1, Lhj/c;->d:Ljava/util/List;

    .line 72
    .line 73
    invoke-interface {v3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v3

    .line 77
    move-object/from16 v16, v3

    .line 78
    .line 79
    check-cast v16, Lhj/i;

    .line 80
    .line 81
    invoke-virtual/range {v16 .. v16}, Lhj/i;->b()I

    .line 82
    .line 83
    .line 84
    move-result v17

    .line 85
    move/from16 v3, v17

    .line 86
    .line 87
    :goto_4
    if-le v3, v2, :cond_4

    .line 88
    .line 89
    new-instance v4, Ljava/lang/StringBuilder;

    .line 90
    .line 91
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 92
    .line 93
    .line 94
    invoke-interface {v7}, Ljava/util/Deque;->peek()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v18

    .line 98
    move-object/from16 v14, v18

    .line 99
    .line 100
    check-cast v14, Ljava/lang/CharSequence;

    .line 101
    .line 102
    invoke-virtual {v4, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    invoke-interface {v7, v4}, Ljava/util/Deque;->push(Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    if-eqz p4, :cond_3

    .line 109
    .line 110
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 111
    .line 112
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 113
    .line 114
    .line 115
    invoke-interface {v6}, Ljava/util/Deque;->peek()Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v4

    .line 119
    check-cast v4, Ljava/util/Collection;

    .line 120
    .line 121
    invoke-interface {v0, v4}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 122
    .line 123
    .line 124
    invoke-interface {v6, v0}, Ljava/util/Deque;->push(Ljava/lang/Object;)V

    .line 125
    .line 126
    .line 127
    :cond_3
    add-int/lit8 v3, v3, -0x1

    .line 128
    .line 129
    goto :goto_4

    .line 130
    :cond_4
    :goto_5
    if-ge v3, v2, :cond_6

    .line 131
    .line 132
    invoke-interface {v7}, Ljava/util/Deque;->pop()Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v4

    .line 136
    check-cast v4, Ljava/lang/StringBuilder;

    .line 137
    .line 138
    invoke-interface {v7}, Ljava/util/Deque;->pop()Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    invoke-interface {v7, v4}, Ljava/util/Deque;->push(Ljava/lang/Object;)V

    .line 142
    .line 143
    .line 144
    if-eqz p4, :cond_5

    .line 145
    .line 146
    invoke-interface {v6}, Ljava/util/Deque;->pop()Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    check-cast v0, Ljava/util/Set;

    .line 151
    .line 152
    invoke-interface {v6}, Ljava/util/Deque;->pop()Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    invoke-interface {v6, v0}, Ljava/util/Deque;->push(Ljava/lang/Object;)V

    .line 156
    .line 157
    .line 158
    :cond_5
    add-int/lit8 v3, v3, 0x1

    .line 159
    .line 160
    goto :goto_5

    .line 161
    :cond_6
    invoke-interface {v7}, Ljava/util/Deque;->peek()Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v2

    .line 165
    move-object v4, v2

    .line 166
    check-cast v4, Ljava/lang/StringBuilder;

    .line 167
    .line 168
    if-eqz p4, :cond_7

    .line 169
    .line 170
    invoke-interface {v6}, Ljava/util/Deque;->peek()Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    check-cast v0, Ljava/util/Set;

    .line 175
    .line 176
    :cond_7
    move-object v14, v0

    .line 177
    const/4 v3, -0x1

    .line 178
    move-object/from16 v2, v16

    .line 179
    .line 180
    move v11, v3

    .line 181
    move-object/from16 v3, p1

    .line 182
    .line 183
    move/from16 v19, v5

    .line 184
    .line 185
    move-object/from16 v5, p3

    .line 186
    .line 187
    move-object/from16 v20, v6

    .line 188
    .line 189
    move-object v6, v14

    .line 190
    move-object/from16 v21, v7

    .line 191
    .line 192
    move v7, v13

    .line 193
    :try_start_0
    invoke-virtual/range {v2 .. v7}, Lhj/i;->r(Lfj/o;Ljava/lang/Appendable;Lfj/d;Ljava/util/Set;Z)I

    .line 194
    .line 195
    .line 196
    move-result v3
    :try_end_0
    .catch Lfj/r; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 197
    const/4 v0, 0x0

    .line 198
    goto :goto_7

    .line 199
    :catch_0
    move-exception v0

    .line 200
    goto :goto_6

    .line 201
    :catch_1
    move-exception v0

    .line 202
    :goto_6
    move v3, v11

    .line 203
    :goto_7
    if-ne v3, v11, :cond_11

    .line 204
    .line 205
    invoke-virtual/range {v16 .. v16}, Lhj/i;->f()I

    .line 206
    .line 207
    .line 208
    move-result v2

    .line 209
    invoke-virtual/range {v16 .. v16}, Lhj/i;->i()Z

    .line 210
    .line 211
    .line 212
    move-result v3

    .line 213
    if-nez v3, :cond_9

    .line 214
    .line 215
    move/from16 v3, v19

    .line 216
    .line 217
    add-int/lit8 v5, v3, 0x1

    .line 218
    .line 219
    :goto_8
    if-ge v5, v10, :cond_a

    .line 220
    .line 221
    iget-object v4, v1, Lhj/c;->d:Ljava/util/List;

    .line 222
    .line 223
    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    move-result-object v4

    .line 227
    check-cast v4, Lhj/i;

    .line 228
    .line 229
    invoke-virtual {v4}, Lhj/i;->i()Z

    .line 230
    .line 231
    .line 232
    move-result v6

    .line 233
    if-eqz v6, :cond_8

    .line 234
    .line 235
    invoke-virtual {v4}, Lhj/i;->f()I

    .line 236
    .line 237
    .line 238
    move-result v4

    .line 239
    if-ne v4, v2, :cond_8

    .line 240
    .line 241
    goto :goto_9

    .line 242
    :cond_8
    add-int/lit8 v5, v5, 0x1

    .line 243
    .line 244
    goto :goto_8

    .line 245
    :cond_9
    move/from16 v3, v19

    .line 246
    .line 247
    :cond_a
    move v5, v3

    .line 248
    :goto_9
    if-gt v5, v3, :cond_d

    .line 249
    .line 250
    invoke-virtual/range {v16 .. v16}, Lhj/i;->i()Z

    .line 251
    .line 252
    .line 253
    move-result v2

    .line 254
    if-eqz v2, :cond_b

    .line 255
    .line 256
    goto :goto_a

    .line 257
    :cond_b
    if-nez v0, :cond_c

    .line 258
    .line 259
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 260
    .line 261
    new-instance v2, Ljava/lang/StringBuilder;

    .line 262
    .line 263
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 264
    .line 265
    .line 266
    invoke-virtual {v2, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 267
    .line 268
    .line 269
    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 270
    .line 271
    .line 272
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 273
    .line 274
    .line 275
    move-result-object v2

    .line 276
    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 277
    .line 278
    .line 279
    throw v0

    .line 280
    :cond_c
    new-instance v2, Ljava/lang/IllegalArgumentException;

    .line 281
    .line 282
    new-instance v3, Ljava/lang/StringBuilder;

    .line 283
    .line 284
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 285
    .line 286
    .line 287
    invoke-virtual {v3, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 288
    .line 289
    .line 290
    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 291
    .line 292
    .line 293
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 294
    .line 295
    .line 296
    move-result-object v3

    .line 297
    invoke-direct {v2, v3, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 298
    .line 299
    .line 300
    throw v2

    .line 301
    :cond_d
    :goto_a
    invoke-interface/range {v21 .. v21}, Ljava/util/Deque;->pop()Ljava/lang/Object;

    .line 302
    .line 303
    .line 304
    new-instance v0, Ljava/lang/StringBuilder;

    .line 305
    .line 306
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 307
    .line 308
    .line 309
    invoke-interface/range {v21 .. v21}, Ljava/util/Collection;->isEmpty()Z

    .line 310
    .line 311
    .line 312
    move-result v2

    .line 313
    if-nez v2, :cond_e

    .line 314
    .line 315
    invoke-interface/range {v21 .. v21}, Ljava/util/Deque;->peek()Ljava/lang/Object;

    .line 316
    .line 317
    .line 318
    move-result-object v2

    .line 319
    check-cast v2, Ljava/lang/CharSequence;

    .line 320
    .line 321
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    .line 322
    .line 323
    .line 324
    :cond_e
    move-object/from16 v2, v21

    .line 325
    .line 326
    invoke-interface {v2, v0}, Ljava/util/Deque;->push(Ljava/lang/Object;)V

    .line 327
    .line 328
    .line 329
    if-eqz p4, :cond_10

    .line 330
    .line 331
    invoke-interface/range {v20 .. v20}, Ljava/util/Deque;->pop()Ljava/lang/Object;

    .line 332
    .line 333
    .line 334
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 335
    .line 336
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 337
    .line 338
    .line 339
    invoke-interface/range {v20 .. v20}, Ljava/util/Collection;->isEmpty()Z

    .line 340
    .line 341
    .line 342
    move-result v3

    .line 343
    if-nez v3, :cond_f

    .line 344
    .line 345
    invoke-interface/range {v20 .. v20}, Ljava/util/Deque;->peek()Ljava/lang/Object;

    .line 346
    .line 347
    .line 348
    move-result-object v3

    .line 349
    check-cast v3, Ljava/util/Collection;

    .line 350
    .line 351
    invoke-interface {v0, v3}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 352
    .line 353
    .line 354
    :cond_f
    move-object/from16 v4, v20

    .line 355
    .line 356
    invoke-interface {v4, v0}, Ljava/util/Deque;->push(Ljava/lang/Object;)V

    .line 357
    .line 358
    .line 359
    goto :goto_b

    .line 360
    :cond_10
    move-object/from16 v4, v20

    .line 361
    .line 362
    goto :goto_b

    .line 363
    :cond_11
    move/from16 v3, v19

    .line 364
    .line 365
    move-object/from16 v4, v20

    .line 366
    .line 367
    move-object/from16 v2, v21

    .line 368
    .line 369
    invoke-virtual/range {v16 .. v16}, Lhj/i;->i()Z

    .line 370
    .line 371
    .line 372
    move-result v0

    .line 373
    if-eqz v0, :cond_12

    .line 374
    .line 375
    invoke-virtual/range {v16 .. v16}, Lhj/i;->u()I

    .line 376
    .line 377
    .line 378
    move-result v5

    .line 379
    goto :goto_b

    .line 380
    :cond_12
    move v5, v3

    .line 381
    :goto_b
    const/4 v3, 0x1

    .line 382
    add-int/2addr v5, v3

    .line 383
    move-object v7, v2

    .line 384
    move-object v6, v4

    .line 385
    move-object v0, v14

    .line 386
    move/from16 v2, v17

    .line 387
    .line 388
    goto/16 :goto_3

    .line 389
    .line 390
    :cond_13
    move-object v4, v6

    .line 391
    move-object v2, v7

    .line 392
    invoke-interface {v2}, Ljava/util/Deque;->peek()Ljava/lang/Object;

    .line 393
    .line 394
    .line 395
    move-result-object v3

    .line 396
    check-cast v3, Ljava/lang/StringBuilder;

    .line 397
    .line 398
    invoke-interface {v2}, Ljava/util/Collection;->clear()V

    .line 399
    .line 400
    .line 401
    invoke-interface {v9, v3}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 402
    .line 403
    .line 404
    if-eqz p4, :cond_16

    .line 405
    .line 406
    invoke-interface {v4}, Ljava/util/Deque;->peek()Ljava/lang/Object;

    .line 407
    .line 408
    .line 409
    move-result-object v0

    .line 410
    check-cast v0, Ljava/util/Set;

    .line 411
    .line 412
    invoke-interface {v4}, Ljava/util/Collection;->clear()V

    .line 413
    .line 414
    .line 415
    goto :goto_d

    .line 416
    :cond_14
    move v11, v2

    .line 417
    :goto_c
    if-ge v11, v10, :cond_16

    .line 418
    .line 419
    :try_start_1
    iget-object v2, v1, Lhj/c;->d:Ljava/util/List;

    .line 420
    .line 421
    invoke-interface {v2, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 422
    .line 423
    .line 424
    move-result-object v2

    .line 425
    move-object v14, v2

    .line 426
    check-cast v14, Lhj/i;

    .line 427
    .line 428
    move-object v2, v14

    .line 429
    move-object/from16 v3, p1

    .line 430
    .line 431
    move-object/from16 v4, p2

    .line 432
    .line 433
    move-object/from16 v5, p3

    .line 434
    .line 435
    move-object v6, v0

    .line 436
    move v7, v13

    .line 437
    invoke-virtual/range {v2 .. v7}, Lhj/i;->r(Lfj/o;Ljava/lang/Appendable;Lfj/d;Ljava/util/Set;Z)I

    .line 438
    .line 439
    .line 440
    invoke-virtual {v14}, Lhj/i;->i()Z

    .line 441
    .line 442
    .line 443
    move-result v2

    .line 444
    if-eqz v2, :cond_15

    .line 445
    .line 446
    invoke-virtual {v14}, Lhj/i;->u()I

    .line 447
    .line 448
    .line 449
    move-result v11
    :try_end_1
    .catch Lfj/r; {:try_start_1 .. :try_end_1} :catch_2

    .line 450
    :cond_15
    const/4 v2, 0x1

    .line 451
    add-int/2addr v11, v2

    .line 452
    goto :goto_c

    .line 453
    :catch_2
    move-exception v0

    .line 454
    new-instance v2, Ljava/lang/IllegalArgumentException;

    .line 455
    .line 456
    new-instance v3, Ljava/lang/StringBuilder;

    .line 457
    .line 458
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 459
    .line 460
    .line 461
    invoke-virtual {v3, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 462
    .line 463
    .line 464
    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 465
    .line 466
    .line 467
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 468
    .line 469
    .line 470
    move-result-object v3

    .line 471
    invoke-direct {v2, v3, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 472
    .line 473
    .line 474
    throw v2

    .line 475
    :cond_16
    :goto_d
    if-eqz p4, :cond_17

    .line 476
    .line 477
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    .line 478
    .line 479
    .line 480
    move-result-object v0

    .line 481
    return-object v0

    .line 482
    :cond_17
    const/4 v2, 0x0

    .line 483
    return-object v2

    .line 484
    :cond_18
    new-instance v0, Ljava/lang/NullPointerException;

    .line 485
    .line 486
    const-string v2, "Missing text result buffer."

    .line 487
    .line 488
    invoke-direct {v0, v2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 489
    .line 490
    .line 491
    throw v0
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
.end method

.method public K(Ljava/lang/Object;Ljava/lang/Appendable;Lfj/d;)Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Ljava/lang/Appendable;",
            "Lfj/d;",
            ")",
            "Ljava/util/Set<",
            "Lhj/g;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p3}, Lhj/c;->k(Ljava/lang/Object;Lfj/d;)Lfj/o;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const/4 v0, 0x1

    .line 6
    invoke-virtual {p0, p1, p2, p3, v0}, Lhj/c;->J(Lfj/o;Ljava/lang/Appendable;Lfj/d;Z)Ljava/util/Set;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1
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
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
.end method

.method public R(Lfj/c;Ljava/lang/Enum;)Lhj/c;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<A:",
            "Ljava/lang/Enum<",
            "TA;>;>(",
            "Lfj/c<",
            "TA;>;TA;)",
            "Lhj/c<",
            "TT;>;"
        }
    .end annotation

    .line 1
    new-instance v0, Lgj/a$b;

    .line 2
    .line 3
    invoke-direct {v0}, Lgj/a$b;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lhj/c;->c:Lhj/b;

    .line 7
    .line 8
    invoke-virtual {v1}, Lhj/b;->e()Lgj/a;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v0, v1}, Lgj/a$b;->f(Lgj/a;)Lgj/a$b;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {v0, p1, p2}, Lgj/a$b;->d(Lfj/c;Ljava/lang/Enum;)Lgj/a$b;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-virtual {p1}, Lgj/a$b;->a()Lgj/a;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    new-instance p2, Lhj/c;

    .line 25
    .line 26
    invoke-direct {p2, p0, p1}, Lhj/c;-><init>(Lhj/c;Lgj/a;)V

    .line 27
    .line 28
    .line 29
    return-object p2
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

.method public S(Lgj/g;)Lhj/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lgj/g;",
            ")",
            "Lhj/c<",
            "TT;>;"
        }
    .end annotation

    sget-object v0, Lgj/a;->f:Lfj/c;

    invoke-virtual {p0, v0, p1}, Lhj/c;->R(Lfj/c;Ljava/lang/Enum;)Lhj/c;

    move-result-object p1

    return-object p1
.end method

.method T(Ljava/util/Map;Lhj/b;)Lhj/c;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Lfj/p<",
            "*>;",
            "Ljava/lang/Object;",
            ">;",
            "Lhj/b;",
            ")",
            "Lhj/c<",
            "TT;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lhj/c;->c:Lhj/b;

    .line 2
    .line 3
    invoke-static {p2, v0}, Lhj/b;->k(Lhj/b;Lhj/b;)Lhj/b;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    new-instance v0, Lhj/c;

    .line 8
    .line 9
    new-instance v1, Lhj/c;

    .line 10
    .line 11
    invoke-direct {v1, p0, p1}, Lhj/c;-><init>(Lhj/c;Ljava/util/Map;)V

    .line 12
    .line 13
    .line 14
    sget-object p1, Lkj/a;->a:Lfj/c;

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    invoke-virtual {p2, p1, v2}, Lhj/b;->a(Lfj/c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    check-cast p1, Lnet/time4j/history/d;

    .line 22
    .line 23
    invoke-direct {v0, v1, p2, p1}, Lhj/c;-><init>(Lhj/c;Lhj/b;Lnet/time4j/history/d;)V

    .line 24
    .line 25
    .line 26
    return-object v0
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

.method public U(Lnet/time4j/tz/l;)Lhj/c;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/time4j/tz/l;",
            ")",
            "Lhj/c<",
            "TT;>;"
        }
    .end annotation

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    new-instance v0, Lgj/a$b;

    .line 4
    .line 5
    invoke-direct {v0}, Lgj/a$b;-><init>()V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lhj/c;->c:Lhj/b;

    .line 9
    .line 10
    invoke-virtual {v1}, Lhj/b;->e()Lgj/a;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v0, v1}, Lgj/a$b;->f(Lgj/a;)Lgj/a$b;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {p1}, Lnet/time4j/tz/l;->z()Lnet/time4j/tz/k;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-virtual {v0, v1}, Lgj/a$b;->i(Lnet/time4j/tz/k;)Lgj/a$b;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-virtual {v0}, Lgj/a$b;->a()Lgj/a;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    iget-object v1, p0, Lhj/c;->c:Lhj/b;

    .line 31
    .line 32
    invoke-virtual {v1, v0}, Lhj/b;->l(Lgj/a;)Lhj/b;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    sget-object v1, Lgj/a;->e:Lfj/c;

    .line 37
    .line 38
    invoke-virtual {p1}, Lnet/time4j/tz/l;->E()Lnet/time4j/tz/o;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-virtual {v0, v1, p1}, Lhj/b;->m(Lfj/c;Ljava/lang/Object;)Lhj/b;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    new-instance v0, Lhj/c;

    .line 47
    .line 48
    invoke-direct {v0, p0, p1}, Lhj/c;-><init>(Lhj/c;Lhj/b;)V

    .line 49
    .line 50
    .line 51
    return-object v0

    .line 52
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    .line 53
    .line 54
    const-string v0, "Missing timezone id."

    .line 55
    .line 56
    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    throw p1
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
.end method

.method public V(Lnet/time4j/tz/k;)Lhj/c;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/time4j/tz/k;",
            ")",
            "Lhj/c<",
            "TT;>;"
        }
    .end annotation

    invoke-static {p1}, Lnet/time4j/tz/l;->N(Lnet/time4j/tz/k;)Lnet/time4j/tz/l;

    move-result-object p1

    invoke-virtual {p0, p1}, Lhj/c;->U(Lnet/time4j/tz/l;)Lhj/c;

    move-result-object p1

    return-object p1
.end method

.method public a(Ljava/lang/Object;Ljava/lang/Appendable;Lfj/d;Lfj/t;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(TT;",
            "Ljava/lang/Appendable;",
            "Lfj/d;",
            "Lfj/t<",
            "Lfj/o;",
            "TR;>;)TR;"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p3}, Lhj/c;->k(Ljava/lang/Object;Lfj/d;)Lfj/o;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const/4 v0, 0x0

    .line 6
    invoke-virtual {p0, p1, p2, p3, v0}, Lhj/c;->J(Lfj/o;Ljava/lang/Appendable;Lfj/d;Z)Ljava/util/Set;

    .line 7
    .line 8
    .line 9
    invoke-interface {p4, p1}, Lfj/t;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
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
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
.end method

.method public b(Ljava/lang/CharSequence;Lhj/s;Lfj/d;)Ljava/lang/Object;
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/CharSequence;",
            "Lhj/s;",
            "Lfj/d;",
            ")TT;"
        }
    .end annotation

    .line 1
    move-object v9, p0

    .line 2
    move-object/from16 v10, p2

    .line 3
    .line 4
    move-object/from16 v11, p3

    .line 5
    .line 6
    iget-object v0, v9, Lhj/c;->k:Lgj/g;

    .line 7
    .line 8
    iget-object v1, v9, Lhj/c;->c:Lhj/b;

    .line 9
    .line 10
    if-eq v11, v1, :cond_0

    .line 11
    .line 12
    new-instance v0, Lhj/p;

    .line 13
    .line 14
    invoke-direct {v0, v11, v1}, Lhj/p;-><init>(Lfj/d;Lfj/d;)V

    .line 15
    .line 16
    .line 17
    sget-object v1, Lgj/a;->f:Lfj/c;

    .line 18
    .line 19
    sget-object v2, Lgj/g;->l:Lgj/g;

    .line 20
    .line 21
    invoke-interface {v0, v1, v2}, Lfj/d;->a(Lfj/c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    check-cast v1, Lgj/g;

    .line 26
    .line 27
    const/4 v2, 0x0

    .line 28
    move-object v12, v0

    .line 29
    move-object v13, v1

    .line 30
    move v8, v2

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    const/4 v1, 0x1

    .line 33
    move-object v13, v0

    .line 34
    move v8, v1

    .line 35
    move-object v12, v11

    .line 36
    :goto_0
    iget-object v0, v9, Lhj/c;->b:Lhj/c$e;

    .line 37
    .line 38
    if-eqz v0, :cond_a

    .line 39
    .line 40
    invoke-virtual {v0}, Lhj/c$e;->f()Ljava/util/List;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    iget-object v14, v9, Lhj/c;->b:Lhj/c$e;

    .line 45
    .line 46
    const/4 v7, 0x1

    .line 47
    move-object v0, p0

    .line 48
    move-object v1, v14

    .line 49
    move-object/from16 v3, p1

    .line 50
    .line 51
    move-object/from16 v4, p2

    .line 52
    .line 53
    move-object v5, v12

    .line 54
    move-object v6, v13

    .line 55
    invoke-static/range {v0 .. v8}, Lhj/c;->D(Lhj/c;Lfj/u;Ljava/util/List;Ljava/lang/CharSequence;Lhj/s;Lfj/d;Lgj/g;ZZ)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    check-cast v0, Lnet/time4j/r;

    .line 60
    .line 61
    invoke-virtual/range {p2 .. p2}, Lhj/s;->i()Z

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    const/4 v2, 0x0

    .line 66
    if-eqz v1, :cond_1

    .line 67
    .line 68
    return-object v2

    .line 69
    :cond_1
    invoke-virtual/range {p2 .. p2}, Lhj/s;->h()Lfj/q;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    invoke-virtual {v1}, Lfj/q;->f()Z

    .line 74
    .line 75
    .line 76
    move-result v3

    .line 77
    if-eqz v3, :cond_2

    .line 78
    .line 79
    invoke-virtual {v1}, Lfj/q;->r()Lnet/time4j/tz/k;

    .line 80
    .line 81
    .line 82
    move-result-object v3

    .line 83
    goto :goto_1

    .line 84
    :cond_2
    sget-object v3, Lgj/a;->d:Lfj/c;

    .line 85
    .line 86
    invoke-interface {v12, v3}, Lfj/d;->b(Lfj/c;)Z

    .line 87
    .line 88
    .line 89
    move-result v4

    .line 90
    if-eqz v4, :cond_3

    .line 91
    .line 92
    invoke-interface {v12, v3}, Lfj/d;->c(Lfj/c;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v3

    .line 96
    check-cast v3, Lnet/time4j/tz/k;

    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_3
    move-object v3, v2

    .line 100
    :goto_1
    if-eqz v3, :cond_7

    .line 101
    .line 102
    sget-object v4, Lgj/a;->u:Lfj/c;

    .line 103
    .line 104
    invoke-interface {v14}, Lfj/u;->a()Lfj/f0;

    .line 105
    .line 106
    .line 107
    move-result-object v5

    .line 108
    invoke-interface {v11, v4, v5}, Lfj/d;->a(Lfj/c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v4

    .line 112
    check-cast v4, Lfj/f0;

    .line 113
    .line 114
    sget-object v5, Lfj/b0;->l:Lfj/b0;

    .line 115
    .line 116
    invoke-virtual {v1, v5}, Lfj/q;->o(Lfj/p;)Z

    .line 117
    .line 118
    .line 119
    move-result v6

    .line 120
    if-eqz v6, :cond_5

    .line 121
    .line 122
    invoke-virtual {v1, v5}, Lfj/q;->k(Lfj/p;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v5

    .line 126
    check-cast v5, Ljava/lang/Boolean;

    .line 127
    .line 128
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 129
    .line 130
    .line 131
    move-result v5

    .line 132
    sget-object v6, Lgj/a;->e:Lfj/c;

    .line 133
    .line 134
    sget-object v7, Lnet/time4j/tz/l;->n:Lnet/time4j/tz/o;

    .line 135
    .line 136
    invoke-interface {v12, v6, v7}, Lfj/d;->a(Lfj/c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v6

    .line 140
    check-cast v6, Lnet/time4j/tz/o;

    .line 141
    .line 142
    if-eqz v5, :cond_4

    .line 143
    .line 144
    sget-object v5, Lnet/time4j/tz/g;->k:Lnet/time4j/tz/g;

    .line 145
    .line 146
    goto :goto_2

    .line 147
    :cond_4
    sget-object v5, Lnet/time4j/tz/g;->l:Lnet/time4j/tz/g;

    .line 148
    .line 149
    :goto_2
    invoke-interface {v6, v5}, Lnet/time4j/tz/o;->a(Lnet/time4j/tz/g;)Lnet/time4j/tz/o;

    .line 150
    .line 151
    .line 152
    move-result-object v5

    .line 153
    invoke-static {v3}, Lnet/time4j/tz/l;->N(Lnet/time4j/tz/k;)Lnet/time4j/tz/l;

    .line 154
    .line 155
    .line 156
    move-result-object v3

    .line 157
    invoke-virtual {v3, v5}, Lnet/time4j/tz/l;->Q(Lnet/time4j/tz/o;)Lnet/time4j/tz/l;

    .line 158
    .line 159
    .line 160
    move-result-object v3

    .line 161
    invoke-virtual {v0, v3, v4}, Lnet/time4j/r;->a(Lnet/time4j/tz/l;Lfj/f0;)Lnet/time4j/a0;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    goto :goto_3

    .line 166
    :cond_5
    sget-object v5, Lgj/a;->e:Lfj/c;

    .line 167
    .line 168
    invoke-interface {v12, v5}, Lfj/d;->b(Lfj/c;)Z

    .line 169
    .line 170
    .line 171
    move-result v6

    .line 172
    if-eqz v6, :cond_6

    .line 173
    .line 174
    invoke-static {v3}, Lnet/time4j/tz/l;->N(Lnet/time4j/tz/k;)Lnet/time4j/tz/l;

    .line 175
    .line 176
    .line 177
    move-result-object v3

    .line 178
    invoke-interface {v12, v5}, Lfj/d;->c(Lfj/c;)Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v5

    .line 182
    check-cast v5, Lnet/time4j/tz/o;

    .line 183
    .line 184
    invoke-virtual {v3, v5}, Lnet/time4j/tz/l;->Q(Lnet/time4j/tz/o;)Lnet/time4j/tz/l;

    .line 185
    .line 186
    .line 187
    move-result-object v3

    .line 188
    invoke-virtual {v0, v3, v4}, Lnet/time4j/r;->a(Lnet/time4j/tz/l;Lfj/f0;)Lnet/time4j/a0;

    .line 189
    .line 190
    .line 191
    move-result-object v0

    .line 192
    goto :goto_3

    .line 193
    :cond_6
    invoke-static {v3}, Lnet/time4j/tz/l;->N(Lnet/time4j/tz/k;)Lnet/time4j/tz/l;

    .line 194
    .line 195
    .line 196
    move-result-object v3

    .line 197
    invoke-virtual {v0, v3, v4}, Lnet/time4j/r;->a(Lnet/time4j/tz/l;Lfj/f0;)Lnet/time4j/a0;

    .line 198
    .line 199
    .line 200
    move-result-object v0

    .line 201
    goto :goto_3

    .line 202
    :cond_7
    move-object v0, v2

    .line 203
    :goto_3
    if-nez v0, :cond_8

    .line 204
    .line 205
    invoke-interface/range {p1 .. p1}, Ljava/lang/CharSequence;->length()I

    .line 206
    .line 207
    .line 208
    move-result v0

    .line 209
    const-string v1, "Missing timezone or offset."

    .line 210
    .line 211
    invoke-virtual {v10, v0, v1}, Lhj/s;->k(ILjava/lang/String;)V

    .line 212
    .line 213
    .line 214
    return-object v2

    .line 215
    :cond_8
    invoke-static {}, Lnet/time4j/a0;->W()Lfj/h0;

    .line 216
    .line 217
    .line 218
    move-result-object v2

    .line 219
    invoke-virtual {v2}, Lfj/h0;->J()Lfj/p;

    .line 220
    .line 221
    .line 222
    move-result-object v2

    .line 223
    invoke-virtual {v1, v2, v0}, Lfj/q;->E(Lfj/p;Ljava/lang/Object;)Lfj/q;

    .line 224
    .line 225
    .line 226
    invoke-static {v0}, Lhj/c;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 227
    .line 228
    .line 229
    move-result-object v0

    .line 230
    invoke-virtual {v13}, Lgj/g;->c()Z

    .line 231
    .line 232
    .line 233
    move-result v2

    .line 234
    if-eqz v2, :cond_9

    .line 235
    .line 236
    move-object/from16 v3, p1

    .line 237
    .line 238
    invoke-static {v1, v0, v3, v10}, Lhj/c;->i(Lfj/q;Ljava/lang/Object;Ljava/lang/CharSequence;Lhj/s;)Ljava/lang/Object;

    .line 239
    .line 240
    .line 241
    :cond_9
    return-object v0

    .line 242
    :cond_a
    move-object/from16 v3, p1

    .line 243
    .line 244
    iget-object v1, v9, Lhj/c;->a:Lfj/x;

    .line 245
    .line 246
    const/4 v2, 0x0

    .line 247
    move-object v0, p0

    .line 248
    move-object/from16 v4, p2

    .line 249
    .line 250
    move-object v5, v12

    .line 251
    move-object v6, v13

    .line 252
    move v7, v8

    .line 253
    invoke-static/range {v0 .. v7}, Lhj/c;->E(Lhj/c;Lfj/x;ILjava/lang/CharSequence;Lhj/s;Lfj/d;Lgj/g;Z)Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    move-result-object v0

    .line 257
    return-object v0
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lhj/c;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-eqz v1, :cond_2

    .line 9
    .line 10
    check-cast p1, Lhj/c;

    .line 11
    .line 12
    iget-object v1, p0, Lhj/c;->a:Lfj/x;

    .line 13
    .line 14
    iget-object v3, p1, Lhj/c;->a:Lfj/x;

    .line 15
    .line 16
    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    iget-object v1, p0, Lhj/c;->b:Lhj/c$e;

    .line 23
    .line 24
    iget-object v3, p1, Lhj/c;->b:Lhj/c$e;

    .line 25
    .line 26
    invoke-static {v1, v3}, Lhj/c;->y(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-eqz v1, :cond_1

    .line 31
    .line 32
    iget-object v1, p0, Lhj/c;->c:Lhj/b;

    .line 33
    .line 34
    iget-object v3, p1, Lhj/c;->c:Lhj/b;

    .line 35
    .line 36
    invoke-virtual {v1, v3}, Lhj/b;->equals(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    if-eqz v1, :cond_1

    .line 41
    .line 42
    iget-object v1, p0, Lhj/c;->e:Ljava/util/Map;

    .line 43
    .line 44
    iget-object v3, p1, Lhj/c;->e:Ljava/util/Map;

    .line 45
    .line 46
    invoke-interface {v1, v3}, Ljava/util/Map;->equals(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    if-eqz v1, :cond_1

    .line 51
    .line 52
    iget-object v1, p0, Lhj/c;->d:Ljava/util/List;

    .line 53
    .line 54
    iget-object p1, p1, Lhj/c;->d:Ljava/util/List;

    .line 55
    .line 56
    invoke-interface {v1, p1}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    if-eqz p1, :cond_1

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_1
    move v0, v2

    .line 64
    :goto_0
    return v0

    .line 65
    :cond_2
    return v2
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
.end method

.method public hashCode()I
    .locals 2

    .line 1
    iget-object v0, p0, Lhj/c;->a:Lfj/x;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x7

    .line 8
    .line 9
    iget-object v1, p0, Lhj/c;->c:Lhj/b;

    .line 10
    .line 11
    invoke-virtual {v1}, Lhj/b;->hashCode()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    mul-int/lit8 v1, v1, 0x1f

    .line 16
    .line 17
    add-int/2addr v0, v1

    .line 18
    iget-object v1, p0, Lhj/c;->d:Ljava/util/List;

    .line 19
    .line 20
    invoke-interface {v1}, Ljava/util/List;->hashCode()I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    mul-int/lit8 v1, v1, 0x25

    .line 25
    .line 26
    add-int/2addr v0, v1

    .line 27
    return v0
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
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
.end method

.method public l(Ljava/lang/Object;)Ljava/lang/String;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)",
            "Ljava/lang/String;"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lhj/c;->I(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public o()Lfj/d;
    .locals 1

    iget-object v0, p0, Lhj/c;->c:Lhj/b;

    return-object v0
.end method

.method p()Lhj/b;
    .locals 1

    iget-object v0, p0, Lhj/c;->c:Lhj/b;

    return-object v0
.end method

.method public q()Lfj/x;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lfj/x<",
            "TT;>;"
        }
    .end annotation

    iget-object v0, p0, Lhj/c;->a:Lfj/x;

    return-object v0
.end method

.method r()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Lfj/p<",
            "*>;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lhj/c;->e:Ljava/util/Map;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const/16 v1, 0x100

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 6
    .line 7
    .line 8
    const-string v1, "net.time4j.format.ChronoFormatter[chronology="

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    iget-object v1, p0, Lhj/c;->a:Lfj/x;

    .line 14
    .line 15
    invoke-virtual {v1}, Lfj/x;->q()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    iget-object v1, p0, Lhj/c;->b:Lhj/c$e;

    .line 27
    .line 28
    if-eqz v1, :cond_0

    .line 29
    .line 30
    const-string v1, ", override="

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    iget-object v1, p0, Lhj/c;->b:Lhj/c$e;

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    :cond_0
    const-string v1, ", default-attributes="

    .line 41
    .line 42
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    iget-object v1, p0, Lhj/c;->c:Lhj/b;

    .line 46
    .line 47
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    const-string v1, ", default-values="

    .line 51
    .line 52
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    iget-object v1, p0, Lhj/c;->e:Ljava/util/Map;

    .line 56
    .line 57
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    const-string v1, ", processors="

    .line 61
    .line 62
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    iget-object v1, p0, Lhj/c;->d:Ljava/util/List;

    .line 66
    .line 67
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    const/4 v2, 0x1

    .line 72
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 73
    .line 74
    .line 75
    move-result v3

    .line 76
    if-eqz v3, :cond_2

    .line 77
    .line 78
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v3

    .line 82
    check-cast v3, Lhj/i;

    .line 83
    .line 84
    if-eqz v2, :cond_1

    .line 85
    .line 86
    const/16 v2, 0x7b

    .line 87
    .line 88
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    const/4 v2, 0x0

    .line 92
    goto :goto_1

    .line 93
    :cond_1
    const/16 v4, 0x7c

    .line 94
    .line 95
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    :goto_1
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    goto :goto_0

    .line 102
    :cond_2
    const-string v1, "}]"

    .line 103
    .line 104
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    return-object v0
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
.end method

.method public u()Ljava/util/Locale;
    .locals 1

    iget-object v0, p0, Lhj/c;->c:Lhj/b;

    invoke-virtual {v0}, Lhj/b;->h()Ljava/util/Locale;

    move-result-object v0

    return-object v0
.end method

.method z()Z
    .locals 2

    iget v0, p0, Lhj/c;->p:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    iget-boolean v0, p0, Lhj/c;->g:Z

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method
