.class public final Lxa/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lxa/g$a;
    }
.end annotation


# static fields
.field public static final c:Lxa/g;


# instance fields
.field private final a:Lxa/i;

.field private final b:Lxa/f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lxa/g$a;

    invoke-direct {v0}, Lxa/g$a;-><init>()V

    invoke-virtual {v0}, Lxa/g$a;->a()Lxa/g;

    move-result-object v0

    sput-object v0, Lxa/g;->c:Lxa/g;

    return-void
.end method

.method synthetic constructor <init>(Lxa/i;Lxa/f;Lxa/m;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxa/g;->a:Lxa/i;

    iput-object p2, p0, Lxa/g;->b:Lxa/f;

    return-void
.end method


# virtual methods
.method public a()Lxa/f;
    .locals 1

    iget-object v0, p0, Lxa/g;->b:Lxa/f;

    return-object v0
.end method

.method public b()Lxa/i;
    .locals 1

    iget-object v0, p0, Lxa/g;->a:Lxa/i;

    return-object v0
.end method
