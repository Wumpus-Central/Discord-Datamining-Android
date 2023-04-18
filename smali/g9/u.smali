.class public final synthetic Lg9/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Lg9/a0$a;

.field public final synthetic l:J

.field public final synthetic m:I


# direct methods
.method public synthetic constructor <init>(Lg9/a0$a;JI)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg9/u;->k:Lg9/a0$a;

    iput-wide p2, p0, Lg9/u;->l:J

    iput p4, p0, Lg9/u;->m:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lg9/u;->k:Lg9/a0$a;

    iget-wide v1, p0, Lg9/u;->l:J

    iget v3, p0, Lg9/u;->m:I

    invoke-static {v0, v1, v2, v3}, Lg9/a0$a;->i(Lg9/a0$a;JI)V

    return-void
.end method
