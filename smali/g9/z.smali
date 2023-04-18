.class public final synthetic Lg9/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Lg9/a0$a;

.field public final synthetic l:Ljava/lang/String;

.field public final synthetic m:J

.field public final synthetic n:J


# direct methods
.method public synthetic constructor <init>(Lg9/a0$a;Ljava/lang/String;JJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg9/z;->k:Lg9/a0$a;

    iput-object p2, p0, Lg9/z;->l:Ljava/lang/String;

    iput-wide p3, p0, Lg9/z;->m:J

    iput-wide p5, p0, Lg9/z;->n:J

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    iget-object v0, p0, Lg9/z;->k:Lg9/a0$a;

    iget-object v1, p0, Lg9/z;->l:Ljava/lang/String;

    iget-wide v2, p0, Lg9/z;->m:J

    iget-wide v4, p0, Lg9/z;->n:J

    invoke-static/range {v0 .. v5}, Lg9/a0$a;->f(Lg9/a0$a;Ljava/lang/String;JJ)V

    return-void
.end method
