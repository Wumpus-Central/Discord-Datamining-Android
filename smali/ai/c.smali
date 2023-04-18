.class public final Lai/c;
.super Lzh/q;
.source "SourceFile"

# interfaces
.implements Ljg/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lai/c$a;
    }
.end annotation


# static fields
.field public static final y:Lai/c$a;


# instance fields
.field private final x:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lai/c$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lai/c$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lai/c;->y:Lai/c$a;

    return-void
.end method

.method private constructor <init>(Llh/c;Lci/n;Lmg/h0;Lgh/m;Lhh/a;Z)V
    .locals 7

    const/4 v6, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    .line 1
    invoke-direct/range {v0 .. v6}, Lzh/q;-><init>(Llh/c;Lci/n;Lmg/h0;Lgh/m;Lih/a;Lbi/f;)V

    .line 2
    iput-boolean p6, p0, Lai/c;->x:Z

    return-void
.end method

.method public synthetic constructor <init>(Llh/c;Lci/n;Lmg/h0;Lgh/m;Lhh/a;ZLkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct/range {p0 .. p6}, Lai/c;-><init>(Llh/c;Lci/n;Lmg/h0;Lgh/m;Lhh/a;Z)V

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "builtins package fragment for "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lpg/z;->d()Llh/c;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " from "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0}, Lth/c;->p(Lmg/m;)Lmg/h0;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
