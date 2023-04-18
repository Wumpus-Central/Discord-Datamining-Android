.class public final synthetic Ld9/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Ld9/e$a$a$a;

.field public final synthetic l:I

.field public final synthetic m:J

.field public final synthetic n:J


# direct methods
.method public synthetic constructor <init>(Ld9/e$a$a$a;IJJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld9/d;->k:Ld9/e$a$a$a;

    iput p2, p0, Ld9/d;->l:I

    iput-wide p3, p0, Ld9/d;->m:J

    iput-wide p5, p0, Ld9/d;->n:J

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    iget-object v0, p0, Ld9/d;->k:Ld9/e$a$a$a;

    iget v1, p0, Ld9/d;->l:I

    iget-wide v2, p0, Ld9/d;->m:J

    iget-wide v4, p0, Ld9/d;->n:J

    invoke-static/range {v0 .. v5}, Ld9/e$a$a;->a(Ld9/e$a$a$a;IJJ)V

    return-void
.end method
